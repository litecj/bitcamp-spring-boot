package com.example.demo._0707.Bank.controller;

import com.example.demo._0707.Bank.Domain.BankAccountDTO;

import java.util.Scanner;

public class BankAccountController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccountDTO bankAccountDomain = new BankAccountDTO();
        System.out.println("name?");
        bankAccountDomain.setName(scanner.next());
        System.out.println("deposit?");
        bankAccountDomain.setAmount(scanner.nextInt());
        bankAccountDomain.deposit(bankAccountDomain.getAmount());
        System.out.println(bankAccountDomain.toString());
        System.out.println("withdraw?");
        bankAccountDomain.setAmount(scanner.nextInt());
        bankAccountDomain.withdraw(bankAccountDomain.getAmount());
        System.out.println(bankAccountDomain.toString());

        /*
        bankAccountDomain.setBalance(scanner.nextInt());
        System.out.println("withdraw?");

        //yoon.setName("yoon");

        //System.out.println(yoon.getName());

         */

        /*
        //각 인스턴스를 대상으로 예금을 진행
        yoon.deposit(5000);
        park.deposit(3000);
        //각 인스턴스를 대상으로 출금을 진행
        yoon.withdraw(2000);
        park.withdraw(2000);
        //각 인스턴스를 대상으로 잔액을 조회
        yoon.checkMyBalance();
        park.checkMyBalance();
        */
    }
}
