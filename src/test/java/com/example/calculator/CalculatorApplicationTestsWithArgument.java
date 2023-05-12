package com.example.calculator;

import com.example.calculator.service.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

@SpringBootTest
public class CalculatorApplicationTestsWithArgument {
    CalculatorServiceImpl out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForTestPlus")
    void shouldReturnSumWithParam(double num1, double num2, double result) {
        Assertions.assertEquals(result,out.plus(num1,num2));
    }

    public static Stream<Arguments> provideParamsForTestPlus() {
        return Stream.of(
                Arguments.of(5.0, 7.0, 12.0),
                Arguments.of(-3.0, 0.0, -3.0),
                Arguments.of(-6.0, -2.0, -8.0),
                Arguments.of(3.0, -3.0, 0.0));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestMinus")
    void shouldReturnMinusWithParam(double num1, double num2, double result) {
        Assertions.assertEquals(result,out.minus(num1,num2));
    }

    public static Stream<Arguments> provideParamsForTestMinus() {
        return Stream.of(
                Arguments.of(5.0, 7.0, -2.0),
                Arguments.of(-3.0, 0.0, -3.0),
                Arguments.of(-6.0, -2.0, -4.0),
                Arguments.of(3.0, -3.0, 6.0));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestMultiply")
    void shouldReturnMultiplyWithParam(double num1, double num2, double result) {
        Assertions.assertEquals(result,out.multiple(num1,num2));
    }

    public static Stream<Arguments> provideParamsForTestMultiply() {
        return Stream.of(
                Arguments.of(5.0, 7.0, 35.0),
                Arguments.of(-3.0, 0.0, -0.0),
                Arguments.of(-6.0, -2.0, 12.0),
                Arguments.of(3.0, -3.0, -9.0));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestDivide")
    void shouldReturnDivideWithParam(double num1, double num2, double result) {
        Assertions.assertEquals(result,out.divide(num1,num2));
    }

    public static Stream<Arguments> provideParamsForTestDivide() {
        return Stream.of(
                Arguments.of(14.0, 7.0, 2.0),
                Arguments.of(-3.0, 3.0, -1.0),
                Arguments.of(-6.0, -2.0, 3.0),
                Arguments.of(3.0, 6.0, 0.5));
    }
}
