package com.fabrik.restcontroller.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.fabrik.restcontroller.dto.ErrorDTO;
import com.fabrik.restcontroller.exception.BusinessException;
import com.fabrik.restcontroller.exception.RequestException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
/**
 *
 * @author mgimenez
 */
@RestControllerAdvice
public class ControllerAdvice {
    @ExceptionHandler(value = RequestException.class)
    public ResponseEntity<ErrorDTO> requestExceptionHandler (RequestException e){
        ErrorDTO error = new ErrorDTO();
        error.setCode(e.getCode());
        error.setMessage(e.getMessage());
        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(value = BusinessException.class)
    public ResponseEntity<ErrorDTO> businessExceptionHandler (BusinessException e){
        ErrorDTO error = new ErrorDTO();
        error.setCode(e.getCode());
        error.setMessage(e.getMessage());
        return new ResponseEntity<>(error,e.getStatus());
    }
    
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDTO> argumentNotValidExceptionHandler (MethodArgumentNotValidException e){
        Map<String, String> errors = new HashMap<>();
        e.getBindingResult().getAllErrors().forEach((error) -> {
        String fieldName = ((FieldError) error).getField();
        String errorMessage = error.getDefaultMessage();
        errors.put(fieldName, errorMessage);
        });
        
        errors.forEach((key, value) -> System.out.println(key + " : " + value));
        ErrorDTO error = new ErrorDTO();
        error.setCode("500");
        error.setMessage(Arrays.toString(errors.entrySet().toArray()));
        return new ResponseEntity<>(error,HttpStatus.INTERNAL_SERVER_ERROR);

    }
    
    
}
