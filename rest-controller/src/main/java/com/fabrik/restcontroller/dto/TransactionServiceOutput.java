package com.fabrik.restcontroller.dto;

import java.io.Serializable;

/**
 *
 * @author mgimenez
 */
public class TransactionServiceOutput implements Serializable{
    private String status;
    private TransactionList payload;

    public TransactionServiceOutput() {
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TransactionList getPayload() {
        return payload;
    }

    public void setPayload(TransactionList payload) {
        this.payload = payload;
    }


    
}
