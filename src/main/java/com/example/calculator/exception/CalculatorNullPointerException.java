package com.example.calculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class CalculatorNullPointerException extends RuntimeException{
    public CalculatorNullPointerException() {
    }

    public CalculatorNullPointerException(String message) {
        super(message);
    }
}
