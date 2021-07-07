package com.example.demo._0707.Bank.controller;

import com.example.demo._0707.Bank.Domain.BankAccountDomain;

public class BankAccountController {
    public static void main(String[] args) {
        //두개의 인스턴스 생성
        BankAccountDomain yoon = new BankAccountDomain();
        yoon.setName("yoon");
        BankAccountDomain park = new BankAccountDomain();
        park.setName("park");

        //yoon.setName("윤");
        //System.out.println(yoon.getName());


        //각 인스턴스를 대상으로 예금을 진행
        yoon.deposit(5000);
        park.deposit(3000);
        //각 인스턴스를 대상으로 출금을 진행
        yoon.withdraw(2000);
        park.withdraw(2000);
        //각 인스턴스를 대상으로 잔액을 조회
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}
