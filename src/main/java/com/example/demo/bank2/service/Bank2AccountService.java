package com.example.demo.bank2.service;

import com.example.demo.bank2.domain.Bank2AccountDTO;

import java.util.List;

public interface Bank2AccountService {
    void add(Bank2AccountDTO bank2Account);
    String count();
    List<? extends Bank2AccountDTO> findAll();
    /*
    -은행이름은 상수로 정한다.
    이름을 입력하면 계좌가 생성된다. 단, 계좌번호는 ****-****-****이고 랜덤값이다.
    이름, 금액, 계좌번호을 입력한 후 입금한 후 잔액을 확인한다
    이름, 금액, 계좌번호을 입력한 후 출금한 후 잔액을 확인한다
    이름, 금액, 계좌번호을 입력한후 잔액을 확인하면 잔액이 보인다
    이름, 계좌번호를 입력한 후, 계좌를 해지한다
     */

    //deposit
    //withdraw
    //balance
    //account production
    //close account
    String[] findAllAccountNumber();
    void createAccount(Bank2AccountDTO bank);
    void dropAccount(Bank2AccountDTO bank);
    //String name(Bank2AccountDTO bank);
    void findBalance(Bank2AccountDTO bank);
    void deposit(Bank2AccountDTO bank);
    void withdraw(Bank2AccountDTO bank);
    Bank2AccountDTO findAccountByAccountNumber(String accountNumber);





}
