package com.example.demo.common.controller;

import com.example.demo._0707.Bicycles.controller.BicycleController2;
import com.example.demo._0707.Dog.controller.DogController2;
import com.example.demo._0707.SwitchDemo;
import com.example.demo._0707.math.Calculator.controller.CalculatorController;
import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorController calculatorController = new CalculatorController();
        DogController2 dogController2 = new DogController2();
        BicycleController2 bicycleController2 = new BicycleController2();

        while (true){
            System.out.println("\n[menu] 0.Exit 1.Calculator 2.sequence  3.Dog 4.Bicycles");
            switch (scanner.next()) {
                case "0" : return;
                case "1" : calculatorController.calculate(); break;
                case "2" : calculatorController.sequence(); break;
                case "3" : dogController2.Dog(); break;
                case "4" : bicycleController2.BicycleController2(); break;


            }

        }
    }
}
