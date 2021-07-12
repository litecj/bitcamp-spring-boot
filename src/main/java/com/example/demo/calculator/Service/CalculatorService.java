package com.example.demo._0707.math.Calculator.Service;

import com.example.demo._0707.math.Calculator.Domain.CalculatorDTO;

public interface CalculatorService {
    int add(CalculatorDTO calculator);
    int subtract(CalculatorDTO calculator);
    int multiple(CalculatorDTO calculator);
    int divide(CalculatorDTO calculator);
    int remain(CalculatorDTO calculator);
/*
    int[] sequence(CalculatorDTO calculator);  // num 01 : 1, num 02 : 10
    int[] sequence2(CalculatorDTO calculator);

 */
    int[] sequence3(CalculatorDTO calculator);

}