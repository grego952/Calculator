package com.kodilla;

public class Calculator {
    public int addNumbers (int a, int b) {
        return a + b;
    }
    public int subtractNumbers (int a, int b) {
        return a - b;
    }
    public static void main(String [] args) {
        Calculator calculator = new Calculator();
        int addResult = calculator.addNumbers(5,5);
        int subtractResult = calculator.subtractNumbers(6,5);

        System.out.println("The results are " + addResult + " " + subtractResult);
    }
}
