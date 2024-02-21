package com.examen.examen.dto;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

public class TeamRequestDto {
    @NotBlank
    @Length(max=100)
    private String name;

    @NotBlank
    @Length(max=100)
    private String city;

    @NotBlank
    @Length(max=100)
    private String country;

    public TeamRequestDto() {
    }

    public TeamRequestDto(@NotBlank @Length(max = 100) String name, @NotBlank @Length(max = 100) String city,
            @NotBlank @Length(max = 100) String country) {
        this.name = name;
        this.city = city;
        this.country = country;
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

    
}
