package com.calculator.supreme.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;


@RestController
@RequestMapping("/calculator-supreme")
public class CalculatorSupremeController {
    @GetMapping("/add/{firstNumber}/{secondNumber}")
    public BigDecimal add(@PathVariable("firstNumber") String firstNumber, @PathVariable("secondNumber") String secondNumber) {
        return (new BigDecimal(firstNumber)).add(new BigDecimal(secondNumber));
    }
    @GetMapping("/subtract/{firstNumber}/{secondNumber}")
    public BigDecimal subtract(@PathVariable("firstNumber") String firstNumber, @PathVariable("secondNumber") String secondNumber) {
        return (new BigDecimal(firstNumber)).subtract(new BigDecimal(secondNumber));
    }

    @GetMapping("/multiply/{firstNumber}/{secondNumber}")
    public BigDecimal multiply(@PathVariable("firstNumber") String firstNumber, @PathVariable("secondNumber") String secondNumber){
        return (new BigDecimal(firstNumber)).multiply(new BigDecimal(secondNumber));
    }
    @GetMapping("/divide/{firstNumber}/{secondNumber}")
    public BigDecimal divide(@PathVariable("firstNumber") String firstNumber, @PathVariable("secondNumber") String secondNumber){
        return ("0".equals(secondNumber)) ? BigDecimal.valueOf(Double.NaN): (new BigDecimal(firstNumber)).divide(new BigDecimal(secondNumber),2);
    }
    @GetMapping("/double/add/{firstNumber}/{secondNumber}")
    public double addAsDouble(@PathVariable("firstNumber") String firstNumber, @PathVariable("secondNumber") String secondNumber) {

        return Double.valueOf(firstNumber) + Double.valueOf(secondNumber);
    }
    @GetMapping("/double/subtract/{firstNumber}/{secondNumber}")
    public double subtractAsDouble(@PathVariable("firstNumber") String firstNumber, @PathVariable("secondNumber") String secondNumber) {

        return Double.valueOf(firstNumber) - Double.valueOf(secondNumber);
    }

    @GetMapping("/double/multiply/{firstNumber}/{secondNumber}")
    public double multiplyAsDouble(@PathVariable("firstNumber") String firstNumber, @PathVariable("secondNumber") String secondNumber){

        return Double.valueOf(firstNumber) * Double.valueOf(secondNumber);
    }
    @GetMapping("/double/divide/{firstNumber}/{secondNumber}")
    public double divideAsDouble(@PathVariable("firstNumber") String firstNumber, @PathVariable("secondNumber") String secondNumber){

        return Double.valueOf(firstNumber) / Double.valueOf(secondNumber);
    }

    @GetMapping("/float/add/{firstNumber}/{secondNumber}")
    public float addAsFloat(@PathVariable("firstNumber") String firstNumber, @PathVariable("secondNumber") String secondNumber) {

        return Float.valueOf(firstNumber) + Float.valueOf(secondNumber);
    }
    @GetMapping("/float/subtract/{firstNumber}/{secondNumber}")
    public float subtractAsFloat(@PathVariable("firstNumber") String firstNumber, @PathVariable("secondNumber") String secondNumber) {

        return Float.valueOf(firstNumber) - Float.valueOf(secondNumber);
    }

    @GetMapping("/float/multiply/{firstNumber}/{secondNumber}")
    public float multiplyAsFloat(@PathVariable("firstNumber") String firstNumber, @PathVariable("secondNumber") String secondNumber){

        return Float.valueOf(firstNumber) * Float.valueOf(secondNumber);
    }
    @GetMapping("/float/divide/{firstNumber}/{secondNumber}")
    public float divideAsFloat(@PathVariable("firstNumber") String firstNumber, @PathVariable("secondNumber") String secondNumber){

        return Float.valueOf(firstNumber) / Float.valueOf(secondNumber);
    }

}



