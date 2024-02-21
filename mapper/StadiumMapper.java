package com.examen.examen.mapper;

import org.springframework.stereotype.Component;

import com.examen.examen.dto.StadiumRequestDto;
import com.examen.examen.dto.StadiumResponseDto;
import com.examen.examen.model.Stadium;
@Component
public class StadiumMapper {
    public Stadium StadiumRequestDtoToStadium(StadiumRequestDto request)
    {
        return new Stadium(request.getName(),request.getCity(),request.getCountry(),request.getCapacity());
    }

    public  StadiumResponseDto StadiumToStadiumResponseDto(Stadium model)
    {
        return new StadiumResponseDto(model.getId(),model.getName(),model.getCity(),model.getCountry(),model.getCapacity());
    }
}
