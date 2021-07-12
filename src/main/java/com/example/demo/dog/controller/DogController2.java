package com.example.demo.dog.controller;

import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogService;
import com.example.demo.dog.service.DogServiceimpl;

import java.util.Scanner;

public class DogController2 {
    /*
    Scanner scanner = new Scanner(System.in);
    DogDTO dog = new DogDTO();
     */
    private DogService dogService;
    private Scanner scanner;
    private DogDTO dog;
    public DogController2() {
        this. dogService = new DogServiceimpl();
        this.scanner = new Scanner(System.in);
        this.dog = new DogDTO(); }

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
