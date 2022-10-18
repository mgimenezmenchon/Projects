package com.fabrik.restcontroller.service.impl;

import com.fabrik.restcontroller.utils.AuthUtils;
import com.fabrik.restcontroller.dto.MoneyTransfer;
import com.fabrik.restcontroller.dto.MoneyTransferInput;
import com.fabrik.restcontroller.dto.StatoOperazione;
import com.fabrik.restcontroller.exception.BusinessException;
import com.fabrik.restcontroller.exception.RequestException;
import com.fabrik.restcontroller.service.MoneyTransferService;
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
public class MoneyTransferServiceImpl implements MoneyTransferService{
    
    @Autowired
    private RestTemplate restTemplate;
     
    @Autowired
    private AuthSettings authSettings;
    
     @Override
     public StatoOperazione placeMoneyTransfer(Long accountId, MoneyTransferInput paymentInfo){
    
        StatoOperazione output = new StatoOperazione();
        try{
            if (accountId == null) throw new RequestException("401","Parametro 'accountId' è obbligatorio nella chiamata al servizio");
            
            String serviceUrl = authSettings.getBaseUrl().concat("{accountId}/payments/money-transfers");
            serviceUrl = serviceUrl.replace("{accountId}",accountId.toString());
            
            HttpEntity<?> entity= AuthUtils.setAuthHeaders(authSettings.getApikey(),authSettings.getSchema(),paymentInfo);
            ResponseEntity<MoneyTransfer> response = restTemplate.exchange(serviceUrl, HttpMethod.POST, entity, new ParameterizedTypeReference<MoneyTransfer>() {});
            MoneyTransfer moneyTrasferResponse = (MoneyTransfer)response.getBody();

            output.setCode(moneyTrasferResponse.getStatus());
            output.setDescription(moneyTrasferResponse.getMoneyTransferId());

        }catch(BadRequest br){ 
            throw new BusinessException("API000",HttpStatus.INTERNAL_SERVER_ERROR,"Errore tecnico. La condizione BP049 non e' prevista per il conto id " +accountId.toString());
        }
        catch(RequestException | InternalServerError is){
             throw new BusinessException("API000",HttpStatus.INTERNAL_SERVER_ERROR,"Errore tecnico. Non è stato possibile procedere con l'operazione:" + is.getMessage());
        }
        
        return output;
         
     }
}
