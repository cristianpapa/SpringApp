package com.examen.examen.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Contracts")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date startDate;
    private Date endDate;
    private double wage;
    private double releaseClause;
    public Contract() {
    }
    public Contract(Long id, Date startDate, Date endDate, double wage, double releaseClause) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.wage = wage;
        this.releaseClause = releaseClause;
    }
    public Contract(Date startDate, Date endDate, double wage, double releaseClause) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.wage = wage;
        this.releaseClause = releaseClause;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
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
