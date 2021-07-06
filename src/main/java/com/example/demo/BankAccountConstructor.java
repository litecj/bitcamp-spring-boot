package com.example.demo;


//      https://ssons.tistory.com/29 : 관련 참고 자료//
class BankAccount02 {
    int balance = 0;
    String accNumber; // 계좌번호
    String ssNumber;  // 주민번호
    String name;

    public BankAccount02(String acc, String ss, int bal, String na) {
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
        name = na;
    }
    /*
    // 초기화를 위한 메소드
    public void initAccount(String acc, String ss, int bal, String na) {
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
        name = na;
    }
    */

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
public class BankAccountConstructor {
    public static void main(String[] args) {
        BankAccount02 yoon = new BankAccount02("12-34-89", "990990-9090990",10000,"yoon");
        BankAccount02 park = new BankAccount02("33-55-09", "770088-5959007",10000,"park");

        yoon.deposit(5000);
        park.deposit(3000);
        yoon.withdraw(2000);
        park.withdraw(2000);
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}
