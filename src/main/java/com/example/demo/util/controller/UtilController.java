package com.example.demo.util.controller;

import com.example.demo.util.domain.UtilDTO;
import com.example.demo.util.service.UtilService;
import com.example.demo.util.service.UtilServiceImpl;

import java.time.LocalDate;
import java.time.LocalTime;


public class UtilController {
    private UtilService utilService = new UtilServiceImpl();
    public void utilController() {
        System.out.println(utilService.tonow());
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

