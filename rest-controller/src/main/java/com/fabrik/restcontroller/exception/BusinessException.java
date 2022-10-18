package com.fabrik.restcontroller.exception;

import org.springframework.http.HttpStatus;

/**
 *
 * @author mgimenez
 */

public class BusinessException extends RuntimeException { 
    
  private String code;
  private HttpStatus status;
    
  public BusinessException(String code,HttpStatus httpStatus,String message)
  {
    super(message);
    this.code=code;
    this.status = httpStatus;
  }

  public String getCode() {
        return code;
  }

  public void setCode(String code) {
        this.code = code;
  }

  public HttpStatus getStatus() {
        return status;
  }

  public void setStatus(HttpStatus status) {
        this.status = status;
  }
  
  
  
}


