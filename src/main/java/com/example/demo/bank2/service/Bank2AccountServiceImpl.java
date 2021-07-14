package com.example.demo.bank2.service;

import com.example.demo.bank2.domain.Bank2AccountDTO;
import com.example.demo.util.service.UtilService;
import com.example.demo.util.service.UtilServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Bank2AccountServiceImpl implements Bank2AccountService {
    private Bank2AccountDTO bank2Account;
    private List<Bank2AccountDTO> bank2Accounts;
    public Bank2AccountServiceImpl(){
        bank2Account = new Bank2AccountDTO();
        bank2Accounts = new ArrayList<>();}
    //public Bank2AccountServiceImpl(){ this.bank2Account = new Bank2AccountDTO(); }

    @Override
    public void add(Bank2AccountDTO bank2Account) { bank2Accounts.add(bank2Account);}

    @Override
    public int count() { return bank2Accounts.size(); }

    @Override
    public List<Bank2AccountDTO> findAll() { return bank2Accounts; }

    @Override
    public void createAccount(Bank2AccountDTO bank) {
        UtilService utilService = new UtilServiceImpl();
        String accountNumber = utilService.randomNumbers(4,false)+"-"+
                utilService.randomNumbers(4,true)+"-"+
                utilService.randomNumbers(4,true);
        bank.setAmountNumber(accountNumber);
        bank2Accounts.add(bank);
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
        String[] accountNumbers = new String[count()];
        for (int i=0; i < count(); i++){
            accountNumbers[i] = bank2Accounts.get(i).getAmountNumber();  }
        return accountNumbers; }

    @Override
    public void dropAccount(Bank2AccountDTO bank) { return ; }

    @Override
    public int findBalance(Bank2AccountDTO bank) {
        return bank2Account. getMoney();
    }

    @Override
    public int deposit(Bank2AccountDTO bank) {
        bank2Account.setBalance(bank2Account.getBalance() + bank.getMoney());
        return bank2Account. getMoney(); }

    @Override
    public int withdraw(Bank2AccountDTO bank) {
        bank2Account.setBalance(bank2Account.getBalance()-bank.getMoney());
        return bank2Account. getBalance();
    }

}
