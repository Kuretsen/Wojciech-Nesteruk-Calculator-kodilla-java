package com.kodilla;

public class Calculator {

    public int addAToB(int a, int b) {
        return a+b;
    }
    public int subtractAFromB(int a, int b) {
        return b-a;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a=16;
        int b=31;

        System.out.println(a + " + " + b + " = " +calculator.addAToB(a, b));
        System.out.println(a + " - " + b + " = " +calculator.subtractAFromB(a, b));
    }
}
