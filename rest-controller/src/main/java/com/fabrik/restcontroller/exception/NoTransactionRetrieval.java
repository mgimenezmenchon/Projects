package com.fabrik.restcontroller.exception;

/**
 *
 * @author mgimenez
 */

public class NoTransactionRetrieval extends Exception { 
    
  public NoTransactionRetrieval(String accountId)
  {
    super("Attenzione, impossibile recuperare le transazioni per il conto ".concat(accountId));
  }
}


