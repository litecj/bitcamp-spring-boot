package com.example.demo.math.calculator.Service;

import com.example.demo.math.calculator.Domain.CalculatorDTO;

public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int add(CalculatorDTO calculator) {
        return calculator.getNum01() + calculator.getNum02();
    }

    @Override
    public int subtract(CalculatorDTO calculator) {
        return calculator.getNum01() - calculator.getNum02();
    }

    @Override
    public int multiple(CalculatorDTO calculator) {
        return calculator.getNum01() * calculator.getNum02();
    }

    @Override
    public int divide(CalculatorDTO calculator) {
        return calculator.getNum01() / calculator.getNum02();
    }

    @Override
    public int remain(CalculatorDTO calculator) {
        return calculator.getNum01() % calculator.getNum02();
    }

    @Override
    public int[] sequence3(CalculatorDTO calculator) {
        int count = calculator.getNum02() - calculator.getNum01() + 1;
        int[] arr3 = new int[count];

        int i = 0;
        for (int j = calculator.getNum01(); j <= calculator.getNum02(); j++) {
            arr3[i] = j;
            i++;
        }
        return arr3;
    }
    /*
    @Override
    public int[] sequence(CalculatorDTO calculator) {
        int[] arr = new int[10];
        int i = 0;
        for (int j=1; j<=10; j++){
            arr[i] = j;
            i++;
            //System.out.print(i);
        }
        return arr;
    }

    @Override
    public int[] sequence2(CalculatorDTO calculator) {
        int[] arr2 = new int[20];
        int j = 0;
        for (int k=5; k<25; k++){
            arr2[j] =k;
            j++;
        }
        return arr2;
    }

 */

}

