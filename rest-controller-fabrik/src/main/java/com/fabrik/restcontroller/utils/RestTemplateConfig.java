package com.fabrik.restcontroller.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author mgimenez
 */

@Configuration
public class RestTemplateConfig {
    
    @Bean
    public RestTemplate getRestTemplate() {
            return new RestTemplate();
    }
    
}
