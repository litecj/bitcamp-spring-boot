package com.example.demo.bicycle.service;
//changing gear, changing pedal cadence, applying brakes

import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.util.service.LambdaUtils;

import java.util.List;

public interface BicycleService {

    void add(BicycleDTO bicycle);
    int count();
    List<?> show();

    void changingGear();
    String changingPedal();
    String applyingBrakes();
}
