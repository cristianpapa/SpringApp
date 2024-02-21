package com.examen.examen.dto;

import java.util.Date;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;


public class PlayerRequestDto {
    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @Pattern(regexp = "GK|LB|CB|RB|CM|CDM|CAM|LM|RM|LW|RW|ST|CF", message = "Invalid position")
    private String position;

    @NotNull
    @Past
    private Date dateOfBirth;

    @NotNull
    private Long contractId;

    public PlayerRequestDto() {
    }

    public PlayerRequestDto(@NotNull String firstName, @NotNull String lastName,
            @Pattern(regexp = "GK|LB|CB|RB|CM|CDM|CAM|LM|RM|LW|RW|ST|CF", message = "Invalid position") String position,
            @NotNull @Past Date dateOfBirth, @NotNull Long contractId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.dateOfBirth = dateOfBirth;
        this.contractId = contractId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }
    
    
}
