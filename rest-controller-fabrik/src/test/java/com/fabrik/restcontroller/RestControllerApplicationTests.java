package com.fabrik.restcontroller;

import com.fabrik.restcontroller.dto.TransactionServiceOutput;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class RestControllerApplicationTests {

	@Test
	void contextLoads() {
	}
        
        @Test
        public void testBalanceCall(){
            String serviceUrl = "http://localhost:8080/account/14537780/balance";
            RestTemplate restTemplate = new RestTemplate();
            
            HttpHeaders headers = new HttpHeaders();
            headers.add("api-key", "FXOVVXXHVCPVPBZXIJOBGUGSKHDNFRRQJP");
            headers.add("auth-Schema","S2S");
            headers.add("x-Time-Zone","");
            HttpEntity<?> entity = new HttpEntity<>(headers);
            
            ResponseEntity<String> response = restTemplate.exchange(serviceUrl, HttpMethod.GET, entity, new ParameterizedTypeReference<String>() {});
            System.out.println("testBalanceCall:"+response.getStatusCode());
        }
        
        @Test
        public void testTransactionCall(){
            String serviceUrl = "http://localhost:8080/account/14537780/transactions?from=2022-02-01&to=2022-04-01";
            RestTemplate restTemplate = new RestTemplate();
            
            HttpHeaders headers = new HttpHeaders();
            headers.add("api-key", "FXOVVXXHVCPVPBZXIJOBGUGSKHDNFRRQJP");
            headers.add("auth-Schema","S2S");
            headers.add("x-Time-Zone","");
            HttpEntity<?> entity = new HttpEntity<>(headers);
            
            ResponseEntity<TransactionServiceOutput> response = restTemplate.exchange(serviceUrl, HttpMethod.GET, entity, new ParameterizedTypeReference<TransactionServiceOutput>() {});
            System.out.println("testTransactionCall:"+response.getStatusCode());
        }
        

}
