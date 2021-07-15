package com.example.demo.bicycle.service;

import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.util.service.LambdaUtils;

import java.util.ArrayList;
import java.util.List;

public class BicycleServiceImpl extends LambdaUtils implements BicycleService {
    //ctrl + i
    private BicycleDTO bicycle;
    private ArrayList<BicycleDTO> bicycles;
    public BicycleServiceImpl(){
        bicycle = new BicycleDTO();
        bicycles = new ArrayList<>(); }

    @Override
    public void add(BicycleDTO bicycle) { bicycles.add(bicycle); }

    @Override
    public int count() { return bicycles.size(); }

    @Override
    public List<BicycleDTO> show() { return bicycles; }

    @Override
    public void changingGear() {return ;}

    @Override
    public String changingPedal() {
        return null;
    }

    @Override
    public String applyingBrakes() {
        return null;
    }
}
