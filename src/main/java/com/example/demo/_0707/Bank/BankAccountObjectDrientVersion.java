package com.example.demo._0707.Bank;

class BankAccount {
    int balance = 0;
    String name;
     /*  // 생성자
     BankAccount(String name){
         this.name = name;
     }
     */

     /*  // get+set

     public int getBalance() {
         return balance;
     }
     public void setBalance(int balance) {
         this.balance = balance;
     }
     public String getName() {
         return name;
     }
     public void setName(String name) {
         this.name = name;
     }
     */
    // Apa - 명칭 정리}


    public int deposit (int amount) {
        balance += amount;
        return balance;
    }
    public int withdraw (int amount){
        balance -= amount;
        return balance;
    }
    public int checkMyBalance(){
        System.out.println(name + "잔액 :" + balance);
        return  balance;
    }

    public void setName(String 윤) {
    }
}

public class BankAccountObjectDrientVersion {
    public static void main(String[] args) {
        //두개의 인스턴스 생성
        BankAccount yoon = new BankAccount();
        yoon.name = "yoon";
        BankAccount park = new BankAccount();
        park.name = "park";

        //yoon.setName("윤");
        //System.out.println(yoon.getName());


        //각 인스턴스를 대상으로 예금을 진행
        yoon.deposit(5000);
        park.deposit(3000);
        //각 인스턴스를 대상으로 출금을 진행
        yoon.withdraw(2000);
        park.withdraw(2000);
        //각 인스턴스를 대상으로 잔액을 조회
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}
