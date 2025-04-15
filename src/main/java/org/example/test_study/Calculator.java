package org.example.test_study;
public class Calculator {
    

    public static int add(int a, int b) {
        return a + b;
    }


    public static double divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("除数不能为零");
        }
        return (double) dividend / divisor;
    }


    public static int multiply(int a, int b) {
        return a * b;
    }


    public static int subtract(int a, int b) {
        return a - b;
    }
}