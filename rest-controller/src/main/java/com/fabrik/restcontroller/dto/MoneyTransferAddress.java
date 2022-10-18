package com.fabrik.restcontroller.dto;

import java.io.Serializable;

/**
 *
 * @author mgimenez
 */
public class MoneyTransferAddress implements Serializable{
    private String address;
    private String city; 
    private String countryCode;

    public MoneyTransferAddress() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    
    
}
