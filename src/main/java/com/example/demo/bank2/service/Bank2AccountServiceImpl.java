package com.example.demo.bank2.service;

import com.example.demo.bank2.domain.Bank2AccountDTO;

import java.util.Random;

public class Bank2AccountServiceImpl implements Bank2AccountService {
    private Bank2AccountDTO bank2Account;

    @Override
    public void createAccount(Bank2AccountDTO bank) {
        bank2Account = new Bank2AccountDTO();
        Random randomNumber = new Random();
        for (int i = 0; i < 3; i++)
            System.out.println(randomNumber.nextInt(10000));
        //bank2Account.setAmountNumber();
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
