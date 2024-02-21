package com.examen.examen.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "Players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @Pattern(regexp = "GK|LB|CB|RB|CM|CDM|CAM|LM|RM|LW|RW|ST|CF", message = "Invalid position")
    private String position;

    @NotNull
    @Past
    private Date dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "contract_id")
    private Contract contract;

    public Player() {
    }

    public Player(long id, @NotNull String firstName, @NotNull String lastName,
            @Pattern(regexp = "GK|LB|CB|RB|CM|CDM|CAM|LM|RM|LW|RW|ST|CF|", message = "Invalid position") String position,
            @NotNull @Past Date dateOfBirth, Contract contract) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.dateOfBirth = dateOfBirth;
        this.contract = contract;
    }

    public Player(@NotNull String firstName, @NotNull String lastName,
            @Pattern(regexp = "GK|LB|CB|RB|CM|CDM|CAM|LM|RM|LW|RW|ST|CF|", message = "Invalid position") String position,
            @NotNull @Past Date dateOfBirth, Contract contract) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.dateOfBirth = dateOfBirth;
        this.contract = contract;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
    
}
