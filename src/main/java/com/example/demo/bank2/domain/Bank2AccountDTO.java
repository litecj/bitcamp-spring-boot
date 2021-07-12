package com.example.demo.bank2.domain;

import lombok.Data;

@Data
public class Bank2AccountDTO {
    private String name;
    private int amountNumber;
    private int money;
    private int balance;
    private String date;
    private float interest;
    public static final String BANK_NAME= "BIT BANK";
    //private String bankName;


}
