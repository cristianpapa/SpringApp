package com.examen.examen.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.examen.dto.ContractRequestDto;
import com.examen.examen.dto.ContractResponseDto;
import com.examen.examen.mapper.ContractMapper;
import com.examen.examen.model.Contract;
import com.examen.examen.service.ContractService;

@RestController
@RequestMapping("/contract")
public class ContractController {
    private final ContractService contractService;
    private final ContractMapper contractMapper;

    @Autowired
    public ContractController(ContractService contractService, ContractMapper contractMapper) {
        this.contractService = contractService;
        this.contractMapper = contractMapper;
    }
    @GetMapping
    public ResponseEntity<List<ContractResponseDto>> getAllContracts() {
        List<Contract> contracts = contractService.getAllContracts();
        List<ContractResponseDto> contractDtos = contracts.stream()
                .map(contractMapper::ContractToContractResponseDto)
                .collect(Collectors.toList());
        return new ResponseEntity<>(contractDtos, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ContractResponseDto> createContract(@RequestBody ContractRequestDto contractRequestDto) {
        Contract contract = contractMapper.ContractRequestDtoToContract(contractRequestDto);
        Contract createdContract = contractService.createContract(contract);
        ContractResponseDto createdContractDto = contractMapper.ContractToContractResponseDto(createdContract);
        return new ResponseEntity<>(createdContractDto, HttpStatus.CREATED);
    }

    @DeleteMapping("/{contractId}")
    public ResponseEntity<Void> deleteContract(@PathVariable long contractId) {
        contractService.deleteContract(contractId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{contractId}")
    public ResponseEntity<ContractResponseDto> getContractById(@PathVariable long contractId) {
        Contract contract = contractService.getContractById(contractId);
        if (contract == null) {
            return ResponseEntity.notFound().build();
        }
        ContractResponseDto contractResponseDto = contractMapper.ContractToContractResponseDto(contract);
        return ResponseEntity.ok(contractResponseDto);
    }
}
