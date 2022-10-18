package com.fabrik.restcontroller.dto;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author mgimenez
 */
public class TransactionList implements Serializable{
    private List<Transaction> list;

    public TransactionList() {
    }
    
    public List<Transaction> getList() {
        return list;
    }

    public void setList(List<Transaction> list) {
        this.list = list;
    }

    

}
