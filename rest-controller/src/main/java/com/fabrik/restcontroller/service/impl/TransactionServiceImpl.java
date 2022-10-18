package com.fabrik.restcontroller.service.impl;

import com.fabrik.restcontroller.utils.AuthUtils;
import com.fabrik.restcontroller.dto.TransactionList;
import com.fabrik.restcontroller.dto.TransactionServiceOutput;
import com.fabrik.restcontroller.exception.BusinessException;
import com.fabrik.restcontroller.exception.RequestException;
import com.fabrik.restcontroller.exception.NoTransactionRetrieval;
import com.fabrik.restcontroller.service.TransactionService;
import com.fabrik.restcontroller.utils.AuthSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException.BadRequest;
import org.springframework.web.client.HttpServerErrorException.InternalServerError;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author mgimenez
 */

@Service
public class TransactionServiceImpl implements TransactionService{
    
    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired
    private AuthSettings authSettings;
    
    @Override
    public TransactionList getTransactionList(Long accountId,String from, String to){
        try{
            if (accountId == null) throw new RequestException("401","Parametro 'accountId' è obbligatorio nella chiamata al servizio");
            if (from == null || from.isEmpty())  throw new RequestException("401","Parametro 'from' è obbligatorio nella chiamata al servizio");
            if (to == null || to.isEmpty())  throw new RequestException("401","Parametro 'to' è obbligatorio nella chiamata al servizio");

            String serviceUrl = authSettings.getBaseUrl().concat("{accountId}/transactions?fromAccountingDate={from}&toAccountingDate={to}");
            serviceUrl = serviceUrl.replace("{accountId}",accountId.toString());
            serviceUrl = serviceUrl.replace("{from}",from);
            serviceUrl = serviceUrl.replace("{to}",to);

            HttpEntity<?> entity= AuthUtils.setAuthHeaders(authSettings.getApikey(),authSettings.getSchema());

            ResponseEntity<TransactionServiceOutput> response = restTemplate.exchange(serviceUrl, HttpMethod.GET, entity, new ParameterizedTypeReference<TransactionServiceOutput>() {});
            TransactionServiceOutput output = (TransactionServiceOutput)response.getBody();

            if (output.getStatus() != null && !output.getStatus().equals("OK")) throw new BusinessException("410",HttpStatus.INTERNAL_SERVER_ERROR,"Errore generico nella chiamata al servizio"); 

            return output.getPayload();
        }catch (Exception e){
            throw new BusinessException("410",HttpStatus.INTERNAL_SERVER_ERROR,"Errore generico nella chiamata al servizio"); 
        }
       
    }
    
    
}
