package com.example.demo._0707.math.Calculator.controller;

import com.example.demo._0707.math.Calculator.Domain.CalculatorDate;

import java.util.Scanner;

public class CalculatorController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorDate calculatorDate = new CalculatorDate();
        System.out.println("숫자 1 ?");
        calculatorDate.setNum01(scanner.nextInt());
        System.out.printf("연산자");
        System.out.println("+");
        System.out.println("숫자 2 ?");
        calculatorDate.setNum02(scanner.nextInt());

        System.out.print(calculatorDate.toString());



    }
}
