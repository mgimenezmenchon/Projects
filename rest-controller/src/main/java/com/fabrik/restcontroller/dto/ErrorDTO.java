package com.fabrik.restcontroller.dto;

/**
 *
 * @author mgimenez
 */


public class ErrorDTO {
    private String code;
    private String description;

    public ErrorDTO() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return description;
    }

    public void setMessage(String message) {
        this.description = message;
    }
    
    
    
}
