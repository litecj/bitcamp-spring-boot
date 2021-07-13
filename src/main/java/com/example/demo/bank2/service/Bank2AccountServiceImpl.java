package com.example.demo.bank2.service;

import com.example.demo.bank2.domain.Bank2AccountDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Bank2AccountServiceImpl implements Bank2AccountService {
    private Bank2AccountDTO bank2Account;
    private ArrayList<Bank2AccountDTO> bank2Accounts;
    public Bank2AccountServiceImpl(){
        bank2Account = new Bank2AccountDTO();
        bank2Accounts = new ArrayList<>();}
    //public Bank2AccountServiceImpl(){ this.bank2Account = new Bank2AccountDTO(); }

    @Override
    public void add(Bank2AccountDTO bank2Account) { bank2Accounts.add(bank2Account);}

    @Override
    public int count() { return bank2Accounts.size(); }

    @Override
    public List<Bank2AccountDTO> show() { return bank2Accounts; }


    @Override
    public void createAccount(Bank2AccountDTO bank) {
        Random random = new Random();
        String randomNumber = String.format("%d-%d-%d",random.nextInt(10000),random.nextInt(10000),random.nextInt(10000));
        bank2Account.setAmountNumber(randomNumber);
        bank2Account.setName(bank.getName());
    }

    @Override
    public void dropAccount(Bank2AccountDTO bank) {
        this.bank2Account = null;
        bank2Account.setName(bank.getName());

    }

    @Override
    public int findBalance(Bank2AccountDTO bank) {
        return bank2Account. getMoney();
    }

    @Override
    public int deposit(Bank2AccountDTO bank) {
        int restMoney = bank2Account.getMoney();
        bank2Account.setMoney(restMoney+bank.getMoney());
        return bank2Account. getMoney();
    }

    @Override
    public int withdraw(Bank2AccountDTO bank) {
        int balance = bank2Account.getMoney();
        bank2Account.setMoney(balance-bank.getMoney());
        return bank2Account. getMoney();
    }

}
