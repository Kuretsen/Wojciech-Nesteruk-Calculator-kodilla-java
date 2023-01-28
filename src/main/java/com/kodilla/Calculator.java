package com.kodilla;

public class Calculator {

    public int addAToB(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.addAToB(12, 35);
    }
}
