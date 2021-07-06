package com.example.demo;


//      https://ssons.tistory.com/29 : 관련 참고 자료//
class BankAccount01 {
    int balance = 0;
    String accNumber; // 계좌번호
    String ssNumber;  // 주민번호
    String name;

    // 초기화를 위한 메소드
    public void initAccount(String acc, String ss, int bal, String na) {
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
        name = na;
    }
    public int deposit (int amount) {
        balance += amount;
        return balance;
    }

    public int withdraw (int amount) {
        balance -= amount;
        return balance;
    }
    public int checkMyBalance() {
        System.out.println("성   명:" + name);
        System.out.println("계좌번호:" + accNumber);
        System.out.println("주민번호:" + ssNumber);
        System.out.println("잔   액:" + balance + '\n');
        return balance;
    }

}

//  '\n' : 줄바꿈, 개행 (이스케이프 시퀀스) /https://freedeveloper.tistory.com/191/
//  System.out.println  VS  System.out.printf

class BankAccountUniID {
    public static void main(String[] args) {
        BankAccount01 yoon = new BankAccount01();
        yoon.initAccount("12-34-89", "990990-9090990",10000,"yoon");

        BankAccount01 park = new BankAccount01();
        park.initAccount("33-55-09", "770088-5959007",10000,"park");

        yoon.deposit(5000);
        park.deposit(3000);
        yoon.withdraw(2000);
        park.withdraw(2000);
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}
