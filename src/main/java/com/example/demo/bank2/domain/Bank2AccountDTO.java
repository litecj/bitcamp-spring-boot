package com.example.demo.bank2.domain;

import lombok.Data;

@Data
public class Bank2AccountDTO {
    public static final String BANK_NAME= "BIT BANK";
    //private String bankName;
    private String name;
    private String amountNumber;
    private int money;
    private int balance;
    private String date;
    private float interest;

    @Override
    public String toString() {
        return String.format("%s의 계좌",getName()); }
}
