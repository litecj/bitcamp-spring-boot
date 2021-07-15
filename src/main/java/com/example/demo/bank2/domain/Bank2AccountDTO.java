package com.example.demo.bank2.domain;

import lombok.Data;

@Data
public class Bank2AccountDTO {
    public static final String BANK_NAME = "BIT BANK";
    //private String bankName;
    private String name;
    private String amountNumber;
    private String date;
    private String money;
    private String balance;
    private String interest;

    /*@Override
    public String toString() {
        return String.format("%s의 계좌",getName()); }
     */
    @Override
    public String toString() {
        return BANK_NAME +'\n'+
                "예금주 = " + name + '\'' +'\n'+
                "계좌번호 = " + amountNumber + '\'' +'\n'+
                "잔고 = " + balance + '\'' +'\n'+
                "거래일자 = " + date + '\'' +'\n'+
                "이자율  = " + interest + '\n'
                ;
        //String.format("%s의 계좌",getName()); }
    }
}