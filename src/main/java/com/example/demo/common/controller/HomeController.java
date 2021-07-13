package com.example.demo.common.controller;

import com.example.demo.bicycle.controller.BicycleController2;
import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.dog.controller.DogController2;
import com.example.demo.calculator.controller.CalculatorController;
import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogService;
import com.example.demo.dog.service.DogServiceimpl;
import com.example.demo.util.controller.UtilController;

import java.util.Scanner;

public class HomeController {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogController2 dogController = new DogController2();
        BicycleController2 bicycleController = new BicycleController2();
        while (true){
            System.out.println("\n[menu] 0.Exit 1.Calculator  2.sequence  3.Dog  3-1.DogList  4.Bicycle  4-1.BicyclesList   5.Bank   5-1.BankList   6.Date");
            switch (scanner.next()) {
                case "0" : return;
                case "1" : new CalculatorController().calculate(); break;
                case "2" : new CalculatorController().sequence(); break;
                case "3" :
                    DogDTO dog = new DogDTO();
                    System.out.println("name?");
                    dog.setName(scanner.next());
                    System.out.println("color?");
                    dog.setColor(scanner.next());
                    System.out.println("breed?");
                    dog.setBreed(scanner.next());
                    dogController.addDog(dog);
                    break;
                case "3-1" :
                    dogController.showDogs();
                    break;
                case "4" :
                    BicycleDTO bicycle = new BicycleDTO();
                    System.out.println("maker?");
                    bicycle.setmaker(scanner.next());
                    System.out.println("gear?");
                    bicycle.setGear(scanner.nextInt());
                    System.out.println("pedal?");
                    bicycle.setPedal(scanner.nextBoolean());
                    System.out.println("speed?");
                    bicycle.setSpeed(scanner.nextInt());
                    bicycleController.add(bicycle);
                    break;
                case "4-1" :
                    bicycleController.showBicycles();
                    break;
                case "5" :

                    break;
                case "5-1" :
                    System.out.println("hi");
                    break;
                case "6" : new UtilController().utilController(); break;

            }

        }
    }
}
