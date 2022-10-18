package com.fabrik.restcontroller.service;

/**
 *
 * @author mgimenez
 */

import com.fabrik.restcontroller.dto.MoneyTransferInput;
import com.fabrik.restcontroller.dto.StatoOperazione;
import com.fabrik.restcontroller.exception.NoBalanceRetrieval;

public interface MoneyTransferService {
    public StatoOperazione placeMoneyTransfer(Long accountId,MoneyTransferInput paymentInfo) throws NoBalanceRetrieval;
}

