package com.example.demo.util.service;

import com.example.demo.util.domain.UtilDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;

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

    @Override
    public String randomNumbers(int digits, boolean allowZeroValue) {
        // Math.random()   = 클래식 매소드
        //Random random = new Random();
       // random.nextInt(1000);    = 인스턴스 메소드
        String first = ""; String result ="" ;
        first+=allowZeroValue?((int)(Math.random()*10)) : ((int) (Math.random()*9+1));
        for(int i=0; i<digits-1; i++){result += (int)(Math.random()*10);}
        return first+result;
    }
}
