package com.example.demo.common.controller;

import com.example.demo.bicycle.controller.BicycleController2;
import com.example.demo.dog.controller.DogController2;
import com.example.demo.calculator.controller.CalculatorController;
import com.example.demo.util.controller.UtilController;

import java.util.Scanner;

public class HomeController {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorController calculatorController = new CalculatorController();
        DogController2 dogController2 = new DogController2();
        BicycleController2 bicycleController2 = new BicycleController2();
        UtilController utilController = new UtilController();

        while (true){
            System.out.println("\n[menu] 0.Exit 1.Calculator  2.sequence  3.Dog  4.Bicycles  5.Date");
            switch (scanner.next()) {
                case "0" : return;
                case "1" : calculatorController.calculate(); break;
                case "2" : calculatorController.sequence(); break;
                case "3" : dogController2.Dog(); break;
                case "4" : bicycleController2.BicycleController2(); break;
                case "5" : utilController.utilController(); break;


            }

        }
    }
}
