package com.example.demo.bank2.service;

import com.example.demo.bank2.domain.Bank2AccountDTO;

import java.util.List;

public interface Bank2AccountService {
    void add(Bank2AccountDTO bank2Account);
    int count();
    List<Bank2AccountDTO> show();
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
    void createAccount(Bank2AccountDTO bank);
    void dropAccount(Bank2AccountDTO bank);
    int findBalance(Bank2AccountDTO bank);
    int deposit(Bank2AccountDTO bank);
    int withdraw(Bank2AccountDTO bank);



}
