package com.example.demo.bicycles.controller;

import com.example.demo.bicycles.domain.BicycleDTO;

import java.util.Scanner;

public class BicycleController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BicycleDTO bicycles = new BicycleDTO();

        System.out.println("maker?");
        bicycles.setmaker(scanner.next());

        System.out.println("gear?");
        bicycles.setGear(scanner.nextInt());

        System.out.println("pedal?");
        bicycles.setPedal(scanner.nextBoolean());

        System.out.println("speed?");
        bicycles.setSpeed(scanner.nextInt());


        System.out.print(bicycles.toString());
                /*"이 자전거의 제조사는 %s 입니다. \n 기어는 %d 입니다. \n " + "페달은 %b이며, 최대 %d km/h까지 가능합니다.",
                bicycles.getmaker(),bicycles.getGear(), bicycles.getpedal(), bicycles.getSpeed());*/

    }

}
