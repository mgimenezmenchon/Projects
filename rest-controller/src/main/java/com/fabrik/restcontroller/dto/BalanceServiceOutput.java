package com.fabrik.restcontroller.dto;

import java.io.Serializable;

/**
 *
 * @author mgimenez
 */
public class BalanceServiceOutput implements Serializable{
    private String status;
    private Balance payload;

    public BalanceServiceOutput() {
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Balance getPayload() {
        return payload;
    }

    public void setPayload(Balance payload) {
        this.payload = payload;
    }

    
}
