package com.example.demo.bank.Domain;


public class BankAccountDTO {
    private String name;
    private int amountNumber;
    private int money;
    private String bankName;
    private String date;
    private float interest;
    private int amount;

    private int balance = 0;
    int deposit;
    int withdraw;

    /*  // 생성자
    BankAccount(String name){
        this.name = name;
    }
    */
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getAmount() {
        return this.amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    /*
        public int getDeposit() {
        return deposit;
    }
    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }
    public int getWithdraw() {
        return withdraw;
    }
    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }
     */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

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

    @Override
    public String toString() {
        return String.format("%s'S balance : %d",getName(),balance);
    }
    /*
    public void setName(String 윤) {
    }
    */
}