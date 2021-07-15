package com.example.demo.dog.controller;

import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogService;
import com.example.demo.dog.service.DogServiceImpl;
import com.example.demo.dog.service.DogServiceImpl;
import com.example.demo.util.service.LambdaUtils;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DogController2 extends LambdaUtils {
    private DogService dogService;
    public DogController2(){ dogService = new DogServiceImpl();}
    /*
    private final DogService dogService;
    private final ArrayList<DogDTO> dogs;
     */

    public void DogMain (){
    Scanner scanner = new Scanner(System.in);
    DogDTO dog = null;
    while (true){
        print.accept("[메뉴] : 0.Exit  1.등록  2.카운트  3.list ");
        switch (scanner.next()){
            case "0" : return;
            case "1" :
                dog = new DogDTO();
                print.accept("name?");
                dog.setName(scanner.next());
                print.accept("breed?");
                dog.setBreed(scanner.next());
                print.accept("color?");
                dog.setColor(scanner.next());
                dogService.add(dog);
            break;
            case "2" :
                print.accept(String.format("\n등록된 Dog의 수는 %d 마리입니다.\n", dogService.count()));
                //print.accept(string.apply(dogService.count()));
            break;
            case "3" :
                List<DogDTO> list = (List<DogDTO>)dogService.show();
                for(DogDTO d : list){ print.accept(d.toString());}
            break;
            }
        }
    }
/*
    public void addDog(DogDTO dog){dogService.add(dog);}

    public void showDogs(){
        System.out.println("강아지의 수 : " + dogService.count());
        System.out.println(dogService.show());}

    public String barking(String bark) {
        return dogService.barking((bark)); }

    public String fetching(String target) {
        return dogService.fetching(target);}

    public String waggingTail() {
        return dogService.waggingTail(); }

 */
}

        /*
    Scanner scanner = new Scanner(System.in);
    DogDTO dog = new DogDTO();

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

     */

