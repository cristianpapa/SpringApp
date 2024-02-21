package com.examen.examen.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

public class ContractRequestDto {
    @NotBlank
    private Date startDate;
    @NotBlank
    private Date endDate;
    @Positive
    private double wage;
    @Positive
    private double releaseClause;
    public ContractRequestDto() {
    }
    public ContractRequestDto(@NotBlank Date startDate, @NotBlank Date endDate, @Positive double wage,
            @Positive double releaseClause) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.wage = wage;
        this.releaseClause = releaseClause;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public double getWage() {
        return wage;
    }
    public void setWage(double wage) {
        this.wage = wage;
    }
    public double getReleaseClause() {
        return releaseClause;
    }
    public void setReleaseClause(double releaseClause) {
        this.releaseClause = releaseClause;
    }

    
}
