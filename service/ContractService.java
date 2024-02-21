package com.examen.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen.model.Contract;
import com.examen.examen.repository.ContractRepository;

@Service
public class ContractService {
    private final ContractRepository contractRepository;

    @Autowired
    public ContractService(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    public Contract createContract(Contract contract) {
        // Validate start date before end date
        if (contract.getStartDate().after(contract.getEndDate())) {
            throw new IllegalArgumentException("Start date must be before end date.");
        }

        // Validate positive double values for wage and release clause
        if (contract.getWage() <= 0 || contract.getReleaseClause() <= 0) {
            throw new IllegalArgumentException("Wage and release clause must be positive double values.");
        }

        return contractRepository.save(contract);
    }

    public List<Contract> getAllContracts() {
        return contractRepository.findAll();
    }

    public void deleteContract(long contractId) {
        contractRepository.deleteById(contractId);
    }

    public Contract getContractById(long contractId) {
        return contractRepository.findById(contractId);
    }


}
