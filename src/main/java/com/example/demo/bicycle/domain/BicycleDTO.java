package com.example.demo.bicycle.domain;

import lombok.Data;

@Data
public class BicycleDTO {
    private String maker;
    private String gear;
    private String pedal;
    private String speed;

    @Override
    public String toString() {
        return String.format("\n 자전거의 제조사는 %s 입니다. \n 기어는 %s 입니다. \n " + "페달은 %s이며, 최대 %s km/h까지 가능합니다.\n",
                maker,gear, pedal, speed);

    }

}
