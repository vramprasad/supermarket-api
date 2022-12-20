package com.prasad.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CategoryNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public CategoryNotFoundException(String message){
        super(message);
    }
}
