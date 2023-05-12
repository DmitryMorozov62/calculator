package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @RequestMapping
    public String helloCalculator() {
        return service.hello();
    }

    @RequestMapping("/plus")
    public String plusCalculator(@RequestParam (required = false ) Double num1,
                                 @RequestParam  (required = false) Double num2) {
        return constructor(num1,num2, service.plus(num1,num2)," + ");
    }

    @RequestMapping("/minus")
    public String minusCalculator(@RequestParam (required = false) Double num1,
                                  @RequestParam (required = false) Double num2) {
        return constructor(num1,num2, service.minus(num1,num2)," - ");
    }

    @RequestMapping("/multiply")
    public String multiplyCalculator(@RequestParam (required = false) Double num1,
                                     @RequestParam (required = false) Double num2) {
        return constructor(num1,num2, service.multiple(num1,num2)," * ");
    }

    @RequestMapping("/divide")
    public String divideCalculator(@RequestParam (required = false) Double num1,
                                     @RequestParam (required = false) Double num2) {
        return constructor(num1,num2, service.divide(num1,num2)," / ");
    }

    public String constructor(Double num1, Double num2, Double result, String operation) {
        return num1 + operation + num2 + " = " + result;
    }
}
