package com.example.demo._0707.math.Calculator.controller;

import com.example.demo._0707.math.Calculator.Domain.CalculatorDTO;
import com.example.demo._0707.math.Calculator.Service.CalculatorService;
import com.example.demo._0707.math.Calculator.Service.CalculatorServiceImpl;

import java.util.Scanner;

public class CalculatorController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorDTO calculator = new CalculatorDTO();
        CalculatorService calculatorService = new CalculatorServiceImpl();

        while (true) {
            System.out.println("[menu] 0.종료 1.계산기 2.수열");
            switch (scanner.next()){
                case "0": return;
                case "1" :  System.out.println("숫자 1 ?");
                    calculator.setNum01(scanner.nextInt());
                    System.out.printf("연산자");
                    calculator.setOpcode(scanner.next());
                    System.out.println("숫자 2 ?");
                    calculator.setNum02(scanner.nextInt());
                    int result =0;
                    switch (calculator.getOpcode()) {
                        case "+" : result = calculatorService.add(calculator);
                            //result = calculator.getNum01()+ calculator.getNum02();
                            break;
                        case "-" : result = calculatorService.subtract(calculator);
                            break;
                        case "*" : result = calculatorService.multiple(calculator);
                            break;
                        case "/" : result = calculatorService.divide(calculator);
                            break;
                        case "%" : result = calculatorService.remain(calculator);
                            break;
                    }
                    System.out.printf("%d %s %d = %d",
                            calculator.getNum01(),
                            calculator.getOpcode(),
                            calculator.getNum02(),
                            result);
                    System.out.println();
                    System.out.println(result);
                    break;
                case "2" : System.out.println("수열의 시작 :");
                    calculator.setNum01(scanner.nextInt());
                    System.out.println("수열의 마지막 :");
                    calculator.setNum02(scanner.nextInt());
                    int[] arr3 = calculatorService.sequence3(calculator);
                    for (int i =0; i < arr3.length; i++){
                        System.out.println(arr3[i]+"\t");
                    }
                    break;
            }

        }
        /*
        System.out.println("수열의 시작 :");
        calculator.setNum01(scanner.nextInt());
        System.out.println("수열의 마지막 :");
        calculator.setNum02(scanner.nextInt());
        int[] arr3 = calculatorService.sequence3(calculator);
        for (int i =0; i < arr3.length; i++){
            System.out.println(arr3[i]+"\t");
        }
    /*
        int[] arr = calculatorService.sequence(null);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();


        int[] arr2 = calculatorService.sequence2(null);
            for (int j = 0; j<arr2.length; j++){
            System.out.print(arr2[j]+"\t");
        }

     */

        //calculatorService.sequence2(null);
        /*
        System.out.println("숫자 1 ?");
        calculator.setNum01(scanner.nextInt());
        System.out.printf("연산자");
        calculator.setOpcode(scanner.next());
        System.out.println("숫자 2 ?");
        calculator.setNum02(scanner.nextInt());

        int result =0;
        switch (calculator.getOpcode()) {
            case "+" : result = calculatorService.add(calculator);
                //result = calculator.getNum01()+ calculator.getNum02();
                break;
            case "-" : result = calculatorService.subtract(calculator);
                break;
            case "*" : result = calculatorService.multiple(calculator);
                break;
            case "/" : result = calculatorService.divide(calculator);
                break;
            case "%" : result = calculatorService.remain(calculator);
                break;
        }
        /*
        if(opcode.equals(("+"))){
        }
        else if(opcode.equals(("-"))){
        }
        else if(opcode.equals(("*"))){
        }
        else if(opcode.equals(("/"))){
        }
        else if (opcode.)



        System.out.printf("%d %s %d = %d",
                calculator.getNum01(),
                calculator.getOpcode(),
                calculator.getNum02(),
                result);
        System.out.println();
        System.out.println(result);

        */



    }
}
