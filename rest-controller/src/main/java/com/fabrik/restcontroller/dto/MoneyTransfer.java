package com.fabrik.restcontroller.dto;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author mgimenez
 */
public class MoneyTransfer implements Serializable {
    private String moneyTransferId;
    private String status;
    private String direction;
    private MoneyTransferCreditor creditor;
    private MoneyTransferDebtor debtor;
    private String cro;        
    private String uri;
    private String trn;
    private String description;
    private String createdDatetime;
    private String accountedDatetime;       
    private String debtorValueDate;  
    private String creditorValueDate;    
    private MoneyTransferAmount amount; 
    private Boolean isUrgent; 
    private Boolean isInstant;  
    private String feeType; 
    private String feeAccountId; 
    private List<MoneyTransferFee> fees;
    private Boolean   hasTaxRelief;

    public MoneyTransfer() {
    }

    public String getMoneyTransferId() {
        return moneyTransferId;
    }

    public void setMoneyTransferId(String moneyTransferId) {
        this.moneyTransferId = moneyTransferId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public MoneyTransferCreditor getCreditor() {
        return creditor;
    }

    public void setCreditor(MoneyTransferCreditor creditor) {
        this.creditor = creditor;
    }

    public MoneyTransferDebtor getDebtor() {
        return debtor;
    }

    public void setDebtor(MoneyTransferDebtor debtor) {
        this.debtor = debtor;
    }

    public String getCro() {
        return cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getTrn() {
        return trn;
    }

    public void setTrn(String trn) {
        this.trn = trn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(String createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public String getAccountedDatetime() {
        return accountedDatetime;
    }

    public void setAccountedDatetime(String accountedDatetime) {
        this.accountedDatetime = accountedDatetime;
    }

    public String getDebtorValueDate() {
        return debtorValueDate;
    }

    public void setDebtorValueDate(String debtorValueDate) {
        this.debtorValueDate = debtorValueDate;
    }

    public String getCreditorValueDate() {
        return creditorValueDate;
    }

    public void setCreditorValueDate(String creditorValueDate) {
        this.creditorValueDate = creditorValueDate;
    }

    public MoneyTransferAmount getAmount() {
        return amount;
    }

    public void setAmount(MoneyTransferAmount amount) {
        this.amount = amount;
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

    public List<MoneyTransferFee> getFees() {
        return fees;
    }

    public void setFees(List<MoneyTransferFee> fees) {
        this.fees = fees;
    }

    public Boolean getHasTaxRelief() {
        return hasTaxRelief;
    }

    public void setHasTaxRelief(Boolean hasTaxRelief) {
        this.hasTaxRelief = hasTaxRelief;
    }


}
