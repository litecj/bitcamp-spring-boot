package com.example.demo.math.service;

import com.example.demo.math.domain.MathDTO;
import com.example.demo.util.service.LambdaUtils;

public class MathServiceImpl extends LambdaUtils implements MathService {
    @Override
    public int add(MathDTO mathCalculator) {
        return mathCalculator.getNum1() + mathCalculator.getNum2();}

    @Override
    public int subtract(MathDTO mathCalculator) {
        return mathCalculator.getNum1() - mathCalculator.getNum2(); }

    @Override
    public int multiple(MathDTO mathCalculator) {
        return mathCalculator.getNum1() * mathCalculator.getNum2(); }

    @Override
    public int divide(MathDTO mathCalculator) {
        return mathCalculator.getNum1() / mathCalculator.getNum2(); }

    @Override
    public int remain(MathDTO mathCalculator) {
        return mathCalculator.getNum1() % mathCalculator.getNum2(); }

    @Override
    public int[] sequence(MathDTO mathCalculator) {
        int count = mathCalculator.getNum2() - mathCalculator.getNum1()+1;
        int[] arr = new int[count];
        int i = 0;
        for (int j = mathCalculator.getNum1(); j <= mathCalculator.getNum2(); j++){
            arr[i] = j;
            i++; }
        return arr; }
}
