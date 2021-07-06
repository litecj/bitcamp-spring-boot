package com.example.demo;

import java.util.Scanner;

/* // 기본 구구단
class Data {
    public static void main(String[] args) {
        for (int a = 1; a <= 19; a++) {
            for(int b=1; b<= 19; b++){
                System.out.println(a+"단:"+a+"X"+b+"="+a*b);
             }
            }
        }
}

 */

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("몇단?");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        /*
        <, >, ==, <=, &, |, &&, ||, ^
         */
        // 예외 처리
        while (a<1 || a>19) {
            System.out.println("19단 까지만 출력 가능합니다.");
            System.out.println("다시 몇단?");
            a = scanner.nextInt();
        }
        System.out.println(a+"단");
        for (int b = 1; b <= 19; b++) {
            System.out.println(a + "X" + b + "=" + a * b + "\t");
        }

    }
}