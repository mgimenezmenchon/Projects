package com.fabrik.restcontroller.dto;

import java.io.Serializable;

/**
 *
 * @author mgimenez
 */
public class MoneyTransferAmount implements Serializable{
    private String debtorAmount;
    private String debtorCurrency;
    private String creditorAmount;
    private String creditorCurrency;
    private String creditorCurrencyDate;
    private String exchangeRate;

    public MoneyTransferAmount() {
    }

    public String getDebtorAmount() {
        return debtorAmount;
    }

    public void setDebtorAmount(String debtorAmount) {
        this.debtorAmount = debtorAmount;
    }

    public String getDebtorCurrency() {
        return debtorCurrency;
    }

    public void setDebtorCurrency(String debtorCurrency) {
        this.debtorCurrency = debtorCurrency;
    }

    public String getCreditorAmount() {
        return creditorAmount;
    }

    public void setCreditorAmount(String creditorAmount) {
        this.creditorAmount = creditorAmount;
    }

    public String getCreditorCurrency() {
        return creditorCurrency;
    }

    public void setCreditorCurrency(String creditorCurrency) {
        this.creditorCurrency = creditorCurrency;
    }

    public String getCreditorCurrencyDate() {
        return creditorCurrencyDate;
    }

    public void setCreditorCurrencyDate(String creditorCurrencyDate) {
        this.creditorCurrencyDate = creditorCurrencyDate;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
    
    
}
