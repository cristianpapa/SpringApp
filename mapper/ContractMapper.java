package com.examen.examen.mapper;

import org.springframework.stereotype.Component;

import com.examen.examen.dto.ContractRequestDto;
import com.examen.examen.dto.ContractResponseDto;
import com.examen.examen.model.Contract;

@Component
public class ContractMapper {
    public Contract ContractRequestDtoToContract(ContractRequestDto request)
    {
        return new Contract(request.getStartDate(),request.getEndDate(),request.getWage(),request.getReleaseClause());
    }
    public  ContractResponseDto ContractToContractResponseDto(Contract model)
    {
        return new ContractResponseDto(model.getId(),model.getStartDate(),model.getEndDate(),model.getWage(),model.getReleaseClause());
    }
}
