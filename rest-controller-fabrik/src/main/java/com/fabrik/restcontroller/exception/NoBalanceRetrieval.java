package com.fabrik.restcontroller.exception;

/**
 *
 * @author mgimenez
 */

public class NoBalanceRetrieval extends Exception { 
    
  public NoBalanceRetrieval(String accountId)
  {
    super("Attenzione, impossibile recuperare il saldo per il conto ".concat(accountId));
  }
}


