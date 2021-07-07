package com.example.demo._0707.Dog;

import java.util.Scanner;
//state (name, color, breed, hungry)
// and behavior (barking, fetching, wagging tail)
class Dog {
    private String name;
    private String color;
    private String breed;
    private String hungry;
    //private boolean hungry;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return  this.color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getBreed(){
        return  this.breed;
    }
    /*
    public void  setHungry(boolean hungry){
        this.hungry = hungry;
    }
    public boolean getHungry(){
        return this.hungry;
    }
    */

    public void  setHungry(String hungry){
        this.hungry = hungry;
    }
    public String getHungry(){
        return this.hungry;
    }

    @Override
    public String toString() {
        return String.format("Dog의 \n 이름은 : %s \n 색깔은 : %s \n 품종은 : %s \n 배고픔의 상태는 : %s \n입니다.",getName(), getColor(), getBreed(), getHungry());
    }
}

public class Dogmain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog dog = new Dog();

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
