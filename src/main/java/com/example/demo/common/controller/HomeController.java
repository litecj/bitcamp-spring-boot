package com.example.demo.common.controller;

import com.example.demo.bank2.controller.Bank2AccountController;
import com.example.demo.bicycle.controller.BicycleController2;
import com.example.demo.dog.controller.DogController2;
import com.example.demo.himart.controller.HiMartController;
import com.example.demo.math.controller.MathController;
import com.example.demo.util.controller.UtilController;
import com.example.demo.util.service.LambdaUtils;

import java.util.Scanner;

public class HomeController extends LambdaUtils {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //BicycleController2 bicycleController = new BicycleController2();
        //Bank2AccountController bank2AccountController = new Bank2AccountController();
        while (true){
            System.out.println("\n[menu] 0.Exit 1.Math  2.Dog  3.Bicycle  4.Bank  5.Date  6.HiMart");
            switch (scanner.next()) {
                case "0" : return;
                case "1" : new MathController().main(); break;
                //case "2" : new CalculatorController().sequence(); break;
                case "2" :
                    new DogController2().DogMain(); break;
                    /*
                    DogDTO dog = new DogDTO();
                    System.out.println("name?");
                    dog.setName(scanner.next());
                    System.out.println("color?");
                    dog.setColor(scanner.next());
                    System.out.println("breed?");
                    dog.setBreed(scanner.next());
                    dogController.addDog(dog);
                     */
                case "3" :
                    new BicycleController2().BicycleMain(); break;
                    /*
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
                     */
                case "4" :
                    new Bank2AccountController().BankController();
                    break;
                    /*
                case "5-1" :
                    System.out.println("안녕하세요. 현재 사용된 계좌는\n");
                    bank2AccountController.show();
                    System.out.println("\n 입니다.");
                    break;
                     */
                case "5" : new UtilController().utilController(); break;
                case "6" : new HiMartController().HiMartMain(); break;

            }

        }
    }
}
