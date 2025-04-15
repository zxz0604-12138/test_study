package org.example.test_study;

/**
 * 应用程序入口
 * @author tester_zhang2023
 */
public class App {
    public static void main(String[] args) {
        System.out.println("计算器演示程序");
        System.out.println("3 + 5 = " + Calculator.add(3, 5));
        System.out.println("10 / 2 = " + Calculator.divide(10, 2));
    }
}