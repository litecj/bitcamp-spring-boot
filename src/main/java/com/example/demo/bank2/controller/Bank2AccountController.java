package com.example.demo.bank2.controller;

import com.example.demo.bank2.domain.Bank2AccountDTO;
import com.example.demo.bank2.service.Bank2AccountService;
import com.example.demo.bank2.service.Bank2AccountServiceImpl;

import java.util.Scanner;

public class Bank2AccountController {
    private Scanner scanner;
    private Bank2AccountDTO bank;
    private Bank2AccountService bank2AccountService;

    public Bank2AccountController(){
        this.scanner = new Scanner(System.in);
        this.bank = new Bank2AccountDTO();
        this.bank2AccountService = new Bank2AccountServiceImpl();
    }

    public  void main() {
        System.out.println("안녕하세요"+Bank2AccountDTO.BANK_NAME+"입니다.");
        while (true) {
            System.out.println("0.종료  1.계좌생성  2.계좌해지  3.입금  4.출금  5.잔액확인");
            switch (scanner.next()){
                case "0" : return;
                case "1" :
                    System.out.println("1.계좌생성");
                    System.out.println("name : ");
                    bank.setName(scanner.next());
                    bank2AccountService.createAccount(bank);
                    System.out.printf("name:%s\n amountNumber:%s", bank.getName(),bank.getAmountNumber());
                break;
                case "2" :
                    System.out.println("2.계좌해지");
                    System.out.println("name : ");
                    bank.setName(scanner.next());
                    bank2AccountService.findBalance(bank);
                    System.out.printf("name:%s\n amountNumber:%s", bank.getName(),bank.getAmountNumber());
                break;
                case "3" :
                    System.out.println("3.입금");
                    System.out.println("name : ");
                    bank.setName(scanner.next());
                    System.out.println("\\ : ");
                    bank.setMoney(scanner.nextInt());
                    System.out.printf("name:%s\n 입금 금액:%d \n 잔액 :%d", bank.getName(), bank.getMoney(),bank.getBalance());
                break;
                case "4" :
                    System.out.println("4.출금");
                    System.out.println("name : ");
                    bank.setName(scanner.next());
                    System.out.println("\\ : ");
                    bank.setMoney(scanner.nextInt());
                    System.out.printf("name:%s\n 출금 금액:%d \n 잔액 :%d", bank.getName(), bank.getMoney(),bank.getBalance());
                break;
                case "5" :
                    System.out.println("5.잔액확인");
                    System.out.println("name : ");
                    bank.setName(scanner.next());
                    System.out.printf("name:%s\n 출금 금액:%d \n 잔액 :%d", bank.getName(), bank.getMoney(),bank.getBalance());
                break;

            }
        }

    }



}
