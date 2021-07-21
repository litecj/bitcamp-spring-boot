package com.example.demo.bank2.service;

import com.example.demo.bank2.domain.Bank2AccountDTO;
import com.example.demo.util.service.LambdaUtils;
import com.example.demo.util.service.UtilService;
import com.example.demo.util.service.UtilServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Bank2AccountServiceImpl extends LambdaUtils implements Bank2AccountService {
    private final Bank2AccountDTO bank2Account;
    private final List<Bank2AccountDTO> bank2Accounts;
    private final UtilService utilService;

    public Bank2AccountServiceImpl() {
        bank2Account = new Bank2AccountDTO();
        bank2Accounts = new ArrayList<>();
        utilService = new UtilServiceImpl();
    }
    //public Bank2AccountServiceImpl(){ this.bank2Account = new Bank2AccountDTO(); }

    @Override
    public void add(Bank2AccountDTO bank2Account) {
        bank2Accounts.add(bank2Account);
    }

    @Override
    public String count() {
        return string.apply(bank2Accounts.size());
    }

    @Override
    public List<Bank2AccountDTO> findAll() {
        return bank2Accounts;
    }

    @Override
    public void createAccount(Bank2AccountDTO bank) {
        String accountNumber = utilService.randomNumbers(4, false) + "-" +
                utilService.randomNumbers(4, true) + "-" +
                utilService.randomNumbers(4, true);
        bank.setAmountNumber(accountNumber);
        bank.setBalance("0");
        bank.setDate(utilService.tonow());
        bank.setInterest("0.01");
        bank2Accounts.add(bank);
        print.accept(String.format("name : %s\namountNumber : %s\n",bank.getName(),bank.getAmountNumber()));
        /*
        Random random = new Random();
        String randomNumber = String.format("%d-%d-%d",random.nextInt(10000),random.nextInt(10000),random.nextInt(10000));
        bank2Account.setAmountNumber(randomNumber);
        bank2Accounts.add(bank2Account);
        //return bank2Account.getAmountNumber();
        //bank2Account.setName(bank.getName());
         */
    }

    @Override
    public String[] findAllAccountNumber() {
        int count = strToInt.apply((count()));
        String[] accountNumbers = new String[count];
        for (int i = 0; i < count; i++) {
            accountNumbers[i] = bank2Accounts.get(i).getAmountNumber();
        }
        return accountNumbers;
    }

    @Override
    public void dropAccount(Bank2AccountDTO bank) {
        return;
    }

    @Override
    public void findBalance(Bank2AccountDTO bank) {
        String balance = "";
        for (Bank2AccountDTO accountDTO : bank2Accounts) {
            if (bank.getAmountNumber().equals(accountDTO.getAmountNumber())) {
                //int balance = strToInt.apply(accountDTO.getBalance());
                //accountDTO.setBalance(string.apply(balance + strToInt.apply(bank.getMoney())));
                balance = accountDTO.getAmountNumber().equals(accountDTO.getAmountNumber())? accountDTO.getBalance():"0";
                print.accept(String.format("현재 %s님의 계좌 잔액은 %s 입니다.",accountDTO.getName(), accountDTO.getBalance()));
                break;
            } else {
                print.accept("No Amount Number");}
            return;
        }
        //return bank2Account.getMoney();
    }

    @Override
    public void deposit(Bank2AccountDTO bank) {
        for (Bank2AccountDTO accountDTO : bank2Accounts) {
            System.out.println(bank.getAmountNumber());
            System.out.println(accountDTO.getAmountNumber());

            if (bank.getAmountNumber().equals(accountDTO.getAmountNumber())) {
                int balance = strToInt.apply(accountDTO.getBalance());
                accountDTO.setBalance(string.apply(balance + strToInt.apply(bank.getMoney())));
                print.accept(String.format("입금 금액 : %s \n 입금 후 계좌 상황 : \n %S", bank.getMoney(), accountDTO));
                break;
            } else {
                print.accept("No Amount Number");
            }
        }

        bank.setDate(utilService.tonow());
            return;
        }
        //print.accept(String.format("name : %s \n amountNumber : %s \n  잔액 : %s  \n",bank.getName(),bank.getAmountNumber(),bank.getBalance()));

    // bank2Account.setBalance(bank2Account.getBalance() + bank.getMoney());
    // return bank2Account. getMoney(); }

    /*
     @Override
    public AccountDTO deposit(AccountDTO param) {
        AccountDTO account = findAccountByAccountNumber(param.getAccountNumber());
        int restMoney = strToInt.apply(account.getMoney());
        account.setMoney(restMoney + param.getMoney());
        for(AccountDTO a: acounts){
            if(a.getAccountNumber().equals(account.getAccountNumber())){
                a.setBalance(account.getMoney());
                account = a; }
        }      return account;  }
     */

    @Override
    public void withdraw(Bank2AccountDTO bank) {
        for (Bank2AccountDTO accountDTO : bank2Accounts) {
            if (bank.getAmountNumber().equals(accountDTO.getAmountNumber())) {
                int balance = strToInt.apply(accountDTO.getBalance());
                accountDTO.setBalance(string.apply(balance - strToInt.apply(bank.getMoney())));
                print.accept(String.format("출금 금액 : %s \n 입금 후 계좌 상황 : \n %S",bank.getMoney(), accountDTO));
                break;
            } else {
                print.accept("No Amount Number");}
        bank.setDate(utilService.tonow());
            return;
        }
        //print.accept(String.format("name : %s \n amountNumber : %s \n  잔액 : %s  \n",bank.getName(),bank.getAmountNumber(),bank.getBalance()));
    }
        // bank2Account.setBalance(bank2Account.getBalance() - bank.getMoney());
        //return bank2Account. getBalance();


    @Override
    public Bank2AccountDTO findAccountByAccountNumber(String accountNumber) {
        Bank2AccountDTO bank2Account = null;
        for (Bank2AccountDTO a: bank2Accounts){
            if (a.getAmountNumber().equals(accountNumber)){
                bank2Account = a;
                break;
            }
        }
        return bank2Account;
    }
}