package com.fabrik.restcontroller.service;

/**
 *
 * @author mgimenez
 */

import com.fabrik.restcontroller.dto.BalanceLight;
import com.fabrik.restcontroller.exception.NoBalanceRetrieval;

public interface AccountService {
    public BalanceLight getBalance(Long accountId) throws NoBalanceRetrieval;
}

