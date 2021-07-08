package com.example.demo._0707.math.Calculator.Service;

import com.example.demo._0707.math.Calculator.Domain.CalculatorDTO;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int add(CalculatorDTO calculator) {
        return calculator.getNum01() + calculator.getNum02();
    }

    @Override
    public int subtract(CalculatorDTO calculator) {
        return calculator.getNum01() - calculator.getNum02();
    }

    @Override
    public int multiple(CalculatorDTO calculator) {
        return calculator.getNum01() * calculator.getNum02();
    }

    @Override
    public int divide(CalculatorDTO calculator) {
        return calculator.getNum01() / calculator.getNum02();
    }

    @Override
    public int remain(CalculatorDTO calculator) {
        return calculator.getNum01() % calculator.getNum02();
    }
}
