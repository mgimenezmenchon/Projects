package com.fabrik.restcontroller.dto;

import java.io.Serializable;

/**
 *
 * @author mgimenez
 */
public class MoneyTransferDebtor implements Serializable{
    private String name;
    private MoneyTransferAccount account;

    public MoneyTransferDebtor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MoneyTransferAccount getAccount() {
        return account;
    }

    public void setAccount(MoneyTransferAccount account) {
        this.account = account;
    }
    
}
