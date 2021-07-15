package com.example.demo.util.controller;

import com.example.demo.util.domain.UtilDTO;
import com.example.demo.util.service.LambdaUtils;
import com.example.demo.util.service.UtilService;
import com.example.demo.util.service.UtilServiceImpl;

import java.time.LocalDate;
import java.time.LocalTime;


public class UtilController extends LambdaUtils {
    private UtilService utilService;
    public UtilController(){
        this.utilService = new UtilServiceImpl();}

    //private UtilService utilService = new UtilServiceImpl();

    public void utilController() {
        print.accept(String.format("현재 %s 입니다.",utilService.tonow()));
    }

    /*
    LocalDate today = LocalDate.now();
    LocalTime now = LocalTime.now();


    public void utilController(){
        System.out.printf("%d %s ");
        System.out.println(today+"-"+now);
    }

     */

}

