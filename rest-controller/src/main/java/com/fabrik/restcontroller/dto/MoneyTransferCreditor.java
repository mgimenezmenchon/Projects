package com.fabrik.restcontroller.dto;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 *
 * @author mgimenez
 */

public class MoneyTransferCreditor implements Serializable{
    @NotBlank(message="Questo campo deve essere valorizzato")
    @Size(min = 1, max = 70)
    private String name;
    @Valid
    private MoneyTransferAccount account;
    private MoneyTransferAddress address;

    public MoneyTransferCreditor() {
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

    public MoneyTransferAddress getAddress() {
        return address;
    }

    public void setAddress(MoneyTransferAddress address) {
        this.address = address;
    }
    
    
}
