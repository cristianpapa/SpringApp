package com.examen.examen.dto;

import java.util.Date;

public class ContractResponseDto {
    private long id;
    private Date startDate;
    private Date endDate;
    private double wage;
    private double releaseClause;
    public ContractResponseDto() {
    }
    public ContractResponseDto(long id, Date startDate, Date endDate, double wage, double releaseClause) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.wage = wage;
        this.releaseClause = releaseClause;
    }
    public ContractResponseDto(Date startDate, Date endDate, double wage, double releaseClause) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.wage = wage;
        this.releaseClause = releaseClause;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
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
