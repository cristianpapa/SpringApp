package com.examen.examen.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.Length;

public class InsuranceRequestDto {
    
    // @NotBlank
    // @Pattern(regexp = "ONLINE|POS", message = "Invalid type")
    // private String type;

    // @NotBlank
    // @Length(max=200)
    // private String customer;

    // @NotNull
    // @Positive
    // private Double amount;

    // @NotBlank
    // @Pattern(regexp = "NEW|PROCESSED|CANCELLED", message = "Invalid status")
    // private String status;

    @NotBlank
    @Length(max=200)
    private String policyNumber;

    @NotBlank
    @Pattern(regexp = "house|vehicle|travel", message = "Invalid type")
    private String type;

    @NotNull
    @Positive
    private Double amountToPay;

    @NotNull
    @Positive
    private Double amountInsured;

    @NotBlank
    @Pattern(regexp = "once|quarterly|yearly", message = "Invalid payment terms")
    private String paymentTerms;

    @NotNull
    private boolean active;

    public InsuranceRequestDto() {
    }

    public InsuranceRequestDto(@NotBlank @Length(max = 200) String policyNumber,
            @NotBlank @Pattern(regexp = "house|vehicle|travel", message = "Invalid type") String type,
            @NotNull @Positive Double amountToPay, @NotNull @Positive Double amountInsured,
            @NotBlank @Pattern(regexp = "once|quarterly|yearly", message = "Invalid payment terms") String paymentTerms,
            @NotBlank boolean active) {
        this.policyNumber = policyNumber;
        this.type = type;
        this.amountToPay = amountToPay;
        this.amountInsured = amountInsured;
        this.paymentTerms = paymentTerms;
        this.active = active;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getAmountToPay() {
        return amountToPay;
    }

    public void setAmountToPay(Double amountToPay) {
        this.amountToPay = amountToPay;
    }

    public Double getAmountInsured() {
        return amountInsured;
    }

    public void setAmountInsured(Double amountInsured) {
        this.amountInsured = amountInsured;
    }

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    
}
