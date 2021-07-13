package com.example.demo.dog.domain;

import lombok.Data;

@Data
//state (name, color, breed, hungry)
// and behavior (barking, fetching, wagging tail)
public class DogDTO {
    private String name;
    private String color;
    private String breed;
    //private String hungry;
    //private boolean hungry;
    /*
    public void  setHungry(boolean hungry){
        this.hungry = hungry;}
    public boolean getHungry(){
        return this.hungry;}
    */
    @Override
    public String toString() {
        return String.format("Dog의 \n 이름은 : %s \n 색깔은 : %s \n 품종은 : %s \n 입니다. \n ",
                getName(), getColor(), getBreed());
    }
}

