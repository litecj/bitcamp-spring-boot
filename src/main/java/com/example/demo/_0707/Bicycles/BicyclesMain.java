package com.example.demo._0707.Bicycles;


import java.util.Scanner;

class Bicycles{
    private String maker;
    private int gear;
    private boolean pedal;
    private int speed;

    public void setmaker(String maker) {
        this.maker = maker;
    }
    public String getmaker(){
        return this.maker;
    }

    public void setGear(int gear){
        this.gear = gear;
    }
    public int getGear(){
        return this.gear;
    }

    public void setPedal(boolean pedal){
        this.pedal = pedal;
    }
    public boolean getpedal(){
        return this.pedal;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return this.speed;
    }

    @Override
    public String toString() {
        return String.format("이 자전거의 제조사는 %s 입니다. \n 기어는 %d 입니다. \n " + "페달은 %b이며, 최대 %d km/h까지 가능합니다.",
                getmaker(),getGear(), getpedal(), getSpeed());

    }
}

public class BicyclesMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bicycles bicycles = new Bicycles();

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
