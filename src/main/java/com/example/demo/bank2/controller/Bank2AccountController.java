package com.example.demo.bank2.controller;

import com.example.demo.bank2.domain.Bank2AccountDTO;
import com.example.demo.bank2.service.Bank2AccountService;
import com.example.demo.bank2.service.Bank2AccountServiceImpl;
import com.example.demo.util.service.LambdaUtils;
import org.springframework.asm.SpringAsmInfo;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank2AccountController extends LambdaUtils {
    private Scanner scanner;
   //private Bank2AccountDTO account;
    private Bank2AccountService bank2AccountService;


    public Bank2AccountController(){
        this.scanner = new Scanner(System.in);
        //this.account = new Bank2AccountDTO();
        this.bank2AccountService = new Bank2AccountServiceImpl(); }


    public void BankController() {
        print.accept("안녕하세요"+Bank2AccountDTO.BANK_NAME+"입니다.");
        Bank2AccountDTO account = null;
        while (true) {
            print.accept("0.종료  1.계좌생성  2.계좌해지  3.입금  4.출금  5.잔액확인   5-1.계좌내역   5-2.계좌번호목록  ");
            switch (scanner.next()){
                case "0" : return;
                case "1" :
                    account = new Bank2AccountDTO();
                    print.accept("1.계좌생성");
                    print.accept("name : ");
                    account.setName(scanner.next());
                    bank2AccountService.createAccount(account);
                    //String s = String.format("name : %s\n amountNumber : %s\n", account.getName(),account.getAmountNumber());
                    print.accept(String.format("name : %s\n amountNumber : %s\n", account.getName(),account.getAmountNumber()));
                break;
                case "2" :
                    print.accept("2.계좌해지");
                    print.accept("name : ");
                    account.setName(scanner.next());
                    bank2AccountService.dropAccount(account);
                    print.accept(String.format("name : %s\n amountNumber : %s", account.getName(),account.getAmountNumber()));
                break;
                case "3" :
                    print.accept("3.입금");
                    account = new Bank2AccountDTO();
                    print.accept("계좌번호 : ");
                    account.setAmountNumber(scanner.next());
                    print.accept("\\ : ");
                    account.setMoney(scanner.next());
                    bank2AccountService.deposit(account);
                    print.accept(String.format("name : %s\n 입금 : %s \n 잔액 : %s", account.getName(), account.getMoney(),account.getBalance()));
                break;
                    /*
                    account = new Bank2AccountDTO();
                    System.out.println("3.입금");
                    System.out.println("name : ");
                    account.setName(scanner.next());
                    System.out.println("\\ : ");
                    account.setMoney(scanner.nextInt());
                    bank2AccountService.deposit(account);
                    System.out.printf("name : %s\n 입금 : %d \n 잔액 : %d", account.getName(), account.getMoney(),account.getBalance());
                break;
                     */
                case "4" :
                    print.accept("4.출금");
                    print.accept("계좌번호 : ");
                    account.setAmountNumber(scanner.next());
                    print.accept("\\ : ");
                    account.setMoney(scanner.next());
                    bank2AccountService.withdraw(account);
                    //print.accept(String.format("name : %s\n 출금 : %s \n 잔액 : %s", account.getName(), account.getMoney(),account.getBalance()));
                break;
                case "5" :
                    print.accept("5.잔액확인");
                    print.accept("계좌번호 : ");
                    account.setAmountNumber(scanner.next());
                   // print.accept(String.format("name : %s\n 계좌번호 : %s \n 잔액 : %s", account.getName(), account.getAmountNumber(),account.getBalance()));
                break;
                case "5-1" :
                    print.accept("현재 사용 된 계좌는 " + bank2AccountService.count() + "계좌 입니다");
                    print.accept("내역은 \n" + bank2AccountService.findAll() + "\n 입니다");
                break;
                case "5-2" :
                    for(String aNList : bank2AccountService.findAllAccountNumber()) {
                        print.accept(aNList + '\n');}
                    break;

            }
        }

    }

    public void show(){
        print.accept("현재 계좌 개수 : " + bank2AccountService.count());
        print.accept(string.apply(bank2AccountService.findAll()));
    }






}
