package com.fabrik.restcontroller.dto;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author mgimenez
 */
public class MoneyTransferAccount implements Serializable{
    @NotBlank(message="Questo campo deve essere valorizzato")
    private String accountCode;
    private String bicCode;

    public MoneyTransferAccount() {
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getBicCode() {
        return bicCode;
    }

    public void setBicCode(String bicCode) {
        this.bicCode = bicCode;
    }
   
}
