package com.example.calculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class CalculatorIllegalArgumentException extends RuntimeException {
    public CalculatorIllegalArgumentException() {
    }

    public CalculatorIllegalArgumentException(String message) {
        super(message);
    }
}
