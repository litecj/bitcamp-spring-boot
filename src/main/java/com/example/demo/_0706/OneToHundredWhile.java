package com.example.demo._0706;

public class OneToHundredWhile {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        while (a<=100) {
            sum += a;
            a++;
        }
        System.out.println(sum);
    }
}
