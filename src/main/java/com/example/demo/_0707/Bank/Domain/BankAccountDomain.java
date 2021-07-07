package com.example.demo._0707.Bank.Domain;


public class BankAccountDomain {
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
