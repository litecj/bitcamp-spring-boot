package com.example.demo.util.service;

import com.example.demo.util.domain.UtilDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class UtilServiceImpl implements  UtilService{
    UtilDTO util = new UtilDTO();

    public UtilServiceImpl(){
        this.util = new UtilDTO();
    }

    @Override
    public LocalDate today() {
        util.setToday(LocalDate.now());
        return util.getToday();
    }

    @Override
    public LocalTime currentTime() {
        util.setCurrentTime(LocalTime.now());
        return util.getCurrentTime();
    }

    @Override
    public LocalDateTime now() {
        util.setNow(LocalDateTime.now());
        return util.getNow();
    }

    @Override
    public String tonow() {
        return String.format("%s %s", today(),currentTime());
    }
}
