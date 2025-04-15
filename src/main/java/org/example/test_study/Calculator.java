package org.example.test_study;

/**
 * 计算器工具类
 * @author tester_zhang2023
 */
public class Calculator {
    
    /**
     * 加法运算
     * @param a 被加数
     * @param b 加数
     * @return 和
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * 除法运算
     * @param dividend 被除数
     * @param divisor 除数
     * @return 商
     * @throws IllegalArgumentException 除数为零时抛出
     */
    public static double divide(int dividend, int divisor) {
//        if (divisor == 0) {
//            throw new IllegalArgumentException("除数不能为零");
//        }
        return (double) dividend / divisor;
    }

    /**
     * 乘法运算
     * @param a 因数1
     * @param b 因数2
     * @return 积
     */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * 减法运算
     * @param a 被减数
     * @param b 减数
     * @return 差
     */
    public static int subtract(int a, int b) {
        return a - b;
    }
}