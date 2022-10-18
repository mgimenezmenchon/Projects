package com.fabrik.restcontroller.service.impl;

import com.fabrik.restcontroller.dto.BalanceLight;
import com.fabrik.restcontroller.utils.AuthUtils;
import com.fabrik.restcontroller.dto.BalanceServiceOutput;
import com.fabrik.restcontroller.exception.BusinessException;
import com.fabrik.restcontroller.exception.RequestException;
import com.fabrik.restcontroller.exception.NoBalanceRetrieval;
import com.fabrik.restcontroller.service.AccountService;
import com.fabrik.restcontroller.utils.AuthSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.HttpServerErrorException.InternalServerError;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author mgimenez
 */

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired
    private AuthSettings authSettings;
    
    @Override
    public BalanceLight getBalance(Long accountId){
        
        try{
            if (accountId == null) throw new RequestException("401","Parametro 'accountId' è obbligatorio nella chiamata al servizio");
             
            String serviceUrl = authSettings.getBaseUrl().concat("{accountId}/balance");
            serviceUrl = serviceUrl.replace("{accountId}",accountId.toString());
            
            HttpEntity<?> entity= AuthUtils.setAuthHeaders(authSettings.getApikey(),authSettings.getSchema());
           
            ResponseEntity<BalanceServiceOutput> response = restTemplate.exchange(serviceUrl, HttpMethod.GET, entity, new ParameterizedTypeReference<BalanceServiceOutput>() {});
            BalanceServiceOutput output = (BalanceServiceOutput)response.getBody();
            
            if (output.getStatus() != null && !output.getStatus().equals("OK")) throw new BusinessException("410",HttpStatus.INTERNAL_SERVER_ERROR,"Errore generico nella chiamata al servizio"); 
            
            BalanceLight balanceLight = new BalanceLight();
            balanceLight.setBalance(output.getPayload().getAvailableBalance().concat(output.getPayload().getCurrency()));
            
            return balanceLight;
            
        }catch (Exception e){
            throw new BusinessException("410",HttpStatus.INTERNAL_SERVER_ERROR,"Errore generico nella chiamata al servizio"); 
        }
}
}