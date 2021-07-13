package com.example.demo.bicycle.controller;

import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.bicycle.service.BicycleServiceimpl;

import java.util.List;
import java.util.Scanner;

public class BicycleController2 {
    private BicycleService bicycleService;
    public BicycleController2(){
        this.bicycleService = new BicycleServiceimpl(); }
    /*
    Scanner scanner = new Scanner(System.in);
    BicycleDTO bicycles = new BicycleDTO();
     */
    public void add(BicycleDTO bicycle) {bicycleService.add(bicycle);}

    public void showBicycles() {
        System.out.println("자전거 수 : " + bicycleService.count());
        System.out.println(bicycleService.show()); }

    public void changingGear() {   }

    public String changingPedal() {   return null;  }

    public String applyingBrakes() {     return null;  }
/*
    public void bicycleController2(){
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

 */



}
