package com.examen.examen.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.Length;

public class StadiumRequestDto {
    
    @NotBlank
    @Length(max=100)
    private String name;

    @Length(max=100)
    private String city;

    @Length(max=100)
    private String country;

    @Positive
    private int capacity;

    public StadiumRequestDto() {
    }

    public StadiumRequestDto(@NotBlank @Length(max = 100) String name, @Length(max = 100) String city,
            @Length(max = 100) String country, @Positive int capacity) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    
}
