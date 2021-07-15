package com.example.demo.math.service;

import com.example.demo.math.domain.MathDTO;

public interface MathService {
    int add(MathDTO mathCalculator);
    int subtract(MathDTO mathCalculator);
    int multiple(MathDTO mathCalculator);
    int divide(MathDTO mathCalculator);
    int remain (MathDTO mathCalculator);
    int[] sequence (MathDTO mathCalculator);
}
