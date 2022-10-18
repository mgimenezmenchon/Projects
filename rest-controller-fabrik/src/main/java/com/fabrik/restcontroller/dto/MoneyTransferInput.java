package com.fabrik.restcontroller.dto;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author mgimenez
 */
public class MoneyTransferInput implements Serializable {
    @Valid
    private MoneyTransferCreditor creditor;
    private String executionDate;
    private String uri;
    @NotBlank(message="Questo campo deve essere valorizzato")
    @Size(min = 1, max = 140)
    private String description;
    @NotNull(message="Questo campo deve essere valorizzato")
    @DecimalMin("0.1") 
    private Double amount;
    @NotBlank(message="Questo campo deve essere valorizzato")
    private String currency;
    private Boolean isUrgent;
    private Boolean isInstant;
    private String feeType;
    private String feeAccountId;
    private TaxRelief taxRelief;


    public MoneyTransferInput() {
    }

    public MoneyTransferCreditor getCreditor() {
        return creditor;
    }

    public void setCreditor(MoneyTransferCreditor creditor) {
        this.creditor = creditor;
    }

    public String getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(String executionDate) {
        this.executionDate = executionDate;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
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

    public Boolean getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(Boolean isUrgent) {
        this.isUrgent = isUrgent;
    }

    public Boolean getIsInstant() {
        return isInstant;
    }

    public void setIsInstant(Boolean isInstant) {
        this.isInstant = isInstant;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getFeeAccountId() {
        return feeAccountId;
    }

    public void setFeeAccountId(String feeAccountId) {
        this.feeAccountId = feeAccountId;
    }

    public TaxRelief getTaxRelief() {
        return taxRelief;
    }

    public void setTaxRelief(TaxRelief taxRelief) {
        this.taxRelief = taxRelief;
    }

    


}
