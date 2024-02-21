package com.examen.examen.dto;

public class InsuranceResponseDto {

    private long id;
    private String policyNumber;
    private String type;
    private Double amountToPay;
    private Double amountInsured;
    private String paymentTerms;
    private boolean active;
    public InsuranceResponseDto() {
    }
    public InsuranceResponseDto(long id, String policyNumber, String type, Double amountToPay, Double amountInsured,
            String paymentTerms, boolean active) {
        this.id = id;
        this.policyNumber = policyNumber;
        this.type = type;
        this.amountToPay = amountToPay;
        this.amountInsured = amountInsured;
        this.paymentTerms = paymentTerms;
        this.active = active;
    }
    public long getId() {
        return id;
    }
    public String getPolicyNumber() {
        return policyNumber;
    }
    public String getType() {
        return type;
    }
    public Double getAmountToPay() {
        return amountToPay;
    }
    public Double getAmountInsured() {
        return amountInsured;
    }
    public String getPaymentTerms() {
        return paymentTerms;
    }
    public boolean isActive() {
        return active;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setAmountToPay(Double amountToPay) {
        this.amountToPay = amountToPay;
    }
    public void setAmountInsured(Double amountInsured) {
        this.amountInsured = amountInsured;
    }
    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }
    public void setActive(boolean active) {
        this.active = active;
    }

    
}
