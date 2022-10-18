package com.fabrik.restcontroller.dto;

import java.io.Serializable;

/**
 *
 * @author mgimenez
 */
public class BalanceLight implements Serializable {
    private String balance;

    public BalanceLight() {
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
    
}
