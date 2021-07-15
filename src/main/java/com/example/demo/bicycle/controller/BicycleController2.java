package com.example.demo.bicycle.controller;

import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.bicycle.service.BicycleServiceImpl;
import com.example.demo.util.service.LambdaUtils;

import java.util.List;
import java.util.Scanner;

public class BicycleController2 extends LambdaUtils {
    private BicycleService bicycleService;
    public BicycleController2(){
        this.bicycleService = new BicycleServiceImpl(); }
    /*
    Scanner scanner = new Scanner(System.in);
    BicycleDTO bicycles = new BicycleDTO();
     */
    public void BicycleMain() {
        Scanner scanner = new Scanner(System.in);
        BicycleDTO bicycle = null;
        while (true) {
            print.accept("[메뉴] : 0.Exit  1.등록  2.카운트  3.list ");
            switch (scanner.next()) {
                case "0" : return;
                case "1" :
                    bicycle = new BicycleDTO();
                    print.accept("maker?");
                    bicycle.setMaker(scanner.next());
                    print.accept("gear?");
                    bicycle.setGear(scanner.next());
                    print.accept("pedal?");
                    bicycle.setPedal(scanner.next());
                    print.accept("speed?");
                    bicycle.setSpeed(scanner.next());
                    bicycleService.add(bicycle);
                    break;
                case "2" :
                    print.accept(String.format("\n등록된 자전거의 수는 %d 대 입니다.\n",bicycleService.count()));
                    break;
                case "3" :
                    List<BicycleDTO> list = (List<BicycleDTO>) bicycleService.show();
                    for(BicycleDTO b : list) {print.accept((b.toString()));}
                        break;
                }

            }
        }

    }

        /*
    //public void add(BicycleDTO bicycle) {bicycleService.add(bicycle);}

    public void showBicycles() {
        System.out.println("자전거 수 : " + bicycleService.count());
        System.out.println(bicycleService.show()); }

    public void changingGear() {   }

    public String changingPedal() {   return null;  }

    public String applyingBrakes() {     return null;  }

         */
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




