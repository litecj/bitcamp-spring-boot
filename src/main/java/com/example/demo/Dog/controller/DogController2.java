package com.example.demo.Dog.controller;

import com.example.demo.Dog.domain.DogDTO;

import java.util.Scanner;

public class DogController2 {
    Scanner scanner = new Scanner(System.in);
    DogDTO dog = new DogDTO();

    public void Dog() {

        System.out.println("name?");
        //String name = scanner.next();
        dog.setName(scanner.next());

        System.out.println("color?");
        //String color = scanner.next();
        dog.setColor(scanner.next());

        System.out.println("breed?");
        //String breed = scanner.next();
        dog.setBreed(scanner.next());

        System.out.println("hungry?");
        //String hungry = scanner.next();
        dog.setHungry(scanner.next());


        System.out.print(dog.toString());
    }
}
