package com.example.demo.bicycle.controller;

import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.bicycle.service.BicycleServiceimpl;

import java.util.Scanner;

public class BicycleController2 {
    private BicycleService bicycleService;
    private Scanner scanner;
    private BicycleDTO bicycles;
    public BicycleController2(){
        this.bicycleService = new BicycleServiceimpl();
        this.scanner = new Scanner(System.in);
        this.bicycles = new BicycleDTO();}
    /*
    Scanner scanner = new Scanner(System.in);
    BicycleDTO bicycles = new BicycleDTO();
     */



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
