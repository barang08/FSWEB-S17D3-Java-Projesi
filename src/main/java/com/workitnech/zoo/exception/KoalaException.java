package com.workintech.zoo.exception;


import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class KoalaException extends RuntimeException{
    private HttpStatus httpStatus;

    public KoalaException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
