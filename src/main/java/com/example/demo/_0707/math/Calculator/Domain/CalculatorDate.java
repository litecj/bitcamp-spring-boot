package com.example.demo._0707.math.Calculator.Domain;

public class CalculatorDate {
    private int num01;
    private int num02;
    //private int num03;
    private String opcode;

    public void setNum01(int num01) {
        this.num01 = num01;
    }
    public int getNum01() {
        return this.num01;
    }

    public void setNum02(int num02) {
        this.num02 = num02;
    }
    public int getNum02() {
        return this.num02;
    }

    public String getOpcode(){return opcode;}
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }


    @Override
    public String toString() {
        return String.format("%d+%d=%d", num01, num02, num01 + num02);
    }


}
