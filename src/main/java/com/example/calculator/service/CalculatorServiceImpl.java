package com.example.calculator.service;

import com.example.calculator.exception.CalculatorIllegalArgumentException;
import com.example.calculator.exception.CalculatorNullPointerException;

import org.springframework.stereotype.Service;


@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public Double plus(Double num1, Double num2) {
        notFound(num1,num2);
        return num1 + num2;
    }

    @Override
    public Double minus(Double num1, Double num2) {
        notFound(num1,num2);
        return num1 - num2;
    }

    @Override
    public Double multiple(Double num1, Double num2) {
        notFound(num1,num2);
        return num1 * num2;
    }

    @Override
    public Double divide(Double num1, Double num2) {
        notFound(num1,num2);
        num2IsZero(num2);
        return num1 / num2;
    }

    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public void notFound(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            throw new CalculatorNullPointerException();
        }
    }

    public void num2IsZero(Double num2) {
        if (num2 == 0) {
            throw new CalculatorIllegalArgumentException("Делить на 0 не желательно");
        }
    }
}
