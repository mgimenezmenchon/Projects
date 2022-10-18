package com.fabrik.restcontroller.api;

import com.fabrik.restcontroller.dto.BalanceLight;
import com.fabrik.restcontroller.dto.MoneyTransferInput;
import com.fabrik.restcontroller.dto.StatoOperazione;
import com.fabrik.restcontroller.dto.TransactionList;
import com.fabrik.restcontroller.exception.NoBalanceRetrieval;
import com.fabrik.restcontroller.service.AccountService;
import com.fabrik.restcontroller.service.TransactionService;
import com.fabrik.restcontroller.service.impl.MoneyTransferServiceImpl;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mgimenez
 */

@RestController
@RequestMapping("/account")
public class ContoApi {
    
    @Autowired
    private AccountService accountService;
    
    @Autowired
    private MoneyTransferServiceImpl moneyTransferService;
    
    @Autowired
    private TransactionService transactionService;
    
    

    @GetMapping(value="/{accountId}/balance")
    @ResponseBody
    public ResponseEntity<BalanceLight> letturaSaldo(@PathVariable(required = true, name="accountId") Long accountId) throws NoBalanceRetrieval{
        return new ResponseEntity<>(accountService.getBalance(accountId),HttpStatus.OK);
    }
    
    @PostMapping(value="/{accountId}/transfer")
    public ResponseEntity<StatoOperazione> placeMoneyTransfer(@PathVariable(required = true, name="accountId") Long accountId, @Valid @RequestBody (required = true)  MoneyTransferInput paymentInfo ){
        System.out.print(paymentInfo.getCreditor().getName());
        return new ResponseEntity<> (moneyTransferService.placeMoneyTransfer(accountId,paymentInfo),HttpStatus.OK);
    }
    
    @GetMapping(value="/{accountId}/transactions")
    @ResponseBody
    public ResponseEntity<TransactionList> getTransactions(@PathVariable(required = true, name="accountId") Long accountId, @RequestParam String from, @RequestParam String to){
        return new ResponseEntity<>(transactionService.getTransactionList(accountId,from,to),HttpStatus.OK);
    }
}
