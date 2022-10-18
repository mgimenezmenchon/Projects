package com.fabrik.restcontroller.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author mgimenez
 */
@Configuration
@ConfigurationProperties("auth")
@PropertySource("file:C:\\my-properties\\rest-service.properties")
public class AuthSettings {
    private String apikey;
    private String schema;
    private String baseUrl;

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

}
