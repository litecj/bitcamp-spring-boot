package com.example.demo._0706;

public class OneToHundred {
    public static void main(String[] args) {
        //sum = 1+2+3+4+.................+100;

        // 배열 for문
        int[] x = new int[100];
        int a, sum = 0;
        for (a = 0; a < 100; a++) x[a] = a + 1;
        for (a = 0; a < 100; a++) sum += x[a];
        System.out.println(+sum);



    }
        /* // for문

        int a = 1;
        int sum = 0;
        for (a=1; a<=100; a++){
            sum += a;
        }
        System.out.println(sum);
    }
         */

        /* // while문
        int sum = 0;
        int a = 0;
        while (a <=100) {
            sum += a;
            a++;
         }
        System.out.println(sum);
         */
}