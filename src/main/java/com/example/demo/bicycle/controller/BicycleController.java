package com.example.demo.bicycle.controller;

import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.util.service.LambdaUtils;

import java.util.Scanner;

public class BicycleController extends LambdaUtils {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BicycleDTO bicycles = new BicycleDTO();

        System.out.println("maker?");
        bicycles.setMaker(scanner.next());

        System.out.println("gear?");
        bicycles.setGear(scanner.next());

        System.out.println("pedal?");
        bicycles.setPedal(scanner.next());

        System.out.println("speed?");
        bicycles.setSpeed(scanner.next());


        print.accept(bicycles.toString());
                /*"이 자전거의 제조사는 %s 입니다. \n 기어는 %d 입니다. \n " + "페달은 %b이며, 최대 %d km/h까지 가능합니다.",
                bicycles.getmaker(),bicycles.getGear(), bicycles.getpedal(), bicycles.getSpeed());*/

    }

}
