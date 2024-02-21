package com.examen.examen.dto;

import java.util.Date;


public class PlayerResponseDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String position;
    private Date dateOfBirth;
    private Long contractId;
    public PlayerResponseDto() {
    }
    public PlayerResponseDto(String firstName, String lastName, String position, Date dateOfBirth, Long contractId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.dateOfBirth = dateOfBirth;
        this.contractId = contractId;
    }
    public PlayerResponseDto(Long id, String firstName, String lastName, String position, Date dateOfBirth,
            Long contractId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.dateOfBirth = dateOfBirth;
        this.contractId = contractId;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
