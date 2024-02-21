package com.examen.examen.controller;

import com.examen.examen.dto.TransferRequestDto;
import com.examen.examen.dto.TransferResponseDto;
import com.examen.examen.mapper.TransferMapper;
import com.examen.examen.model.Transfer;
import com.examen.examen.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/transfers")
public class TransferController {

    private final TransferService transferService;
    private final TransferMapper transferMapper;

    @Autowired
    public TransferController(TransferService transferService, TransferMapper transferMapper) {
        this.transferService = transferService;
        this.transferMapper = transferMapper;
    }

    @PostMapping
    public ResponseEntity<TransferResponseDto> createTransfer(@RequestBody TransferRequestDto requestDto) {
        Transfer transfer = transferMapper.TransferRequestDtoToTransfer(requestDto);
        Transfer createdTransfer = transferService.createTransfer(transfer);
        TransferResponseDto responseDto = transferMapper.TransferToTransferResponseDto(createdTransfer);
        return new ResponseEntity<>(responseDto, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TransferResponseDto> getTransferById(@PathVariable Long id) {
        Transfer transfer = transferService.findTransferById(id);
        if (transfer != null) {
            TransferResponseDto responseDto = transferMapper.TransferToTransferResponseDto(transfer);
            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<TransferResponseDto>> getAllTransfers() {
        List<Transfer> transfers = transferService.getAllTransfers();
        List<TransferResponseDto> responseDtos = transfers.stream()
                .map(transferMapper::TransferToTransferResponseDto)
                .collect(Collectors.toList());
        return new ResponseEntity<>(responseDtos, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTransfer(@PathVariable Long id) {
        boolean deleted = transferService.deleteTransfer(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
