package com.fabrik.restcontroller.utils;

import com.fabrik.restcontroller.dto.MoneyTransferInput;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

/**
 *
 * @author mgimenez
 */
public class AuthUtils {
    
    public static HttpEntity<?> setAuthHeaders(String apiKey, String authSchema,MoneyTransferInput object){
        return buildHeaderObject(apiKey,authSchema,object);
    }
    
    public static HttpEntity<?> setAuthHeaders(String apiKey, String authSchema){
        return buildHeaderObject(apiKey,authSchema,null);
    }
    
    private static HttpEntity<?> buildHeaderObject(String apiKey, String authSchema, MoneyTransferInput object){
            HttpHeaders headers = new HttpHeaders();
            headers.add("api-key", apiKey);
            headers.add("auth-Schema",authSchema);
            headers.add("x-Time-Zone","");
            headers.setContentType(MediaType.APPLICATION_JSON);
            
            if (object != null){
                return new HttpEntity<>(object,headers);
            }else{
                return new HttpEntity<>(headers);
            }
            
    }
    
}
