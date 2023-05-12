package com.example.calculator;

import com.example.calculator.exception.CalculatorIllegalArgumentException;
import com.example.calculator.exception.CalculatorNullPointerException;
import com.example.calculator.service.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {
    CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    void shouldReturnSum() {
        double result = out.plus(6.0, 8.0);
        Assertions.assertEquals(14.0,result);
    }

    @Test
    void shouldReturnSumWithZero() {
        double result = out.plus(6.0, 0.0);
        Assertions.assertEquals(6.0,result);
    }

    @Test
    void shouldReturnSumWithNull() {
        Assertions.assertThrows(CalculatorNullPointerException.class, () -> out.plus(5.0,null));
    }

    @Test
    void shouldReturnMinus() {
        double result = out.minus(6.0, 5.0);
        Assertions.assertEquals(1.0,result);
    }

    @Test
    void shouldReturnMinusWithZero() {
        double result = out.minus(6.0, 0.0);
        Assertions.assertEquals(6.0,result);
    }

    @Test
    void shouldReturnMultiply() {
        double result = out.multiple(6.0, -2.0);
        Assertions.assertEquals(-12.0,result);
    }

    @Test
    void shouldReturnMultiplyWithZero() {
        double result = out.multiple(6.0, 0.0);
        Assertions.assertEquals(0.0,result);
    }

    @Test
    void shouldReturnDivide() {
        double result = out.divide(6.0, 1.0);
        Assertions.assertEquals(6.0,result);
    }


    @Test
    void shouldReturnDivideWithZero() {
        Assertions.assertThrows(CalculatorIllegalArgumentException.class,()->out.divide(5.0,0.0));
    }

}
