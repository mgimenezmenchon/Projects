package com.fabrik.restcontroller.dto;

import java.io.Serializable;

/**
 *
 * @author mgimenez
 */
public class MoneyTransferFee implements Serializable{
    private String feeCode;
    private String description;
    private Double amount;
    private String currency;

    public MoneyTransferFee() {
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    
}