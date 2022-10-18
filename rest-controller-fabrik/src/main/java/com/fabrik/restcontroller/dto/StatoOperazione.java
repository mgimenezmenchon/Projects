package com.fabrik.restcontroller.dto;

import java.io.Serializable;

/**
 *
 * @author mgimenez
 */
public class StatoOperazione implements Serializable{
    private String code;
    private String description;

    public StatoOperazione() {
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
