package com.example.demo.bicycles.controller;

import com.example.demo.bicycles.domain.BicycleDTO;

import java.util.Scanner;

public class BicycleController2 {
    Scanner scanner = new Scanner(System.in);
    BicycleDTO bicycles = new BicycleDTO();

    public void BicycleController2(){
        System.out.println("maker?");
        bicycles.setmaker(scanner.next());

        System.out.println("gear?");
        bicycles.setGear(scanner.nextInt());

        System.out.println("pedal?");
        bicycles.setPedal(scanner.nextBoolean());

        System.out.println("speed?");
        bicycles.setSpeed(scanner.nextInt());


        System.out.print(bicycles.toString());
    }



}
