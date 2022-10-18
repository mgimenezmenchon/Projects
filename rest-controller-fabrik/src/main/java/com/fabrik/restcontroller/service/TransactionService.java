package com.fabrik.restcontroller.service;

/**
 *
 * @author mgimenez
 */

import com.fabrik.restcontroller.dto.TransactionList;

public interface TransactionService {
    public TransactionList getTransactionList(Long accountId,String from, String to);
}

