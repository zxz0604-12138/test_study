package org.example.test_study;


import org.testng.annotations.Test;


import static org.springframework.test.util.AssertionErrors.*;


/**
 * 计算器单元测试
 * @author tester_zhang2023
 */
public class CalculatorTest {

    // 冒烟测试
    @Test
    public void smokeTest() {
        assertNotNull("Calculator类应可实例化", new Calculator());
    }

    // 加法测试
    @Test
    public void testAdd() {
        assertEquals("正整数加法", 8, Calculator.add(3, 5));
        assertEquals("负整数加法", -2, Calculator.add(1, -3));
        assertEquals("零值加法", 5, Calculator.add(5, 0));
    }

    // 除法测试
    @Test
    public void testDivideNormal() {
        assertEquals("正常除法", 2.5, Calculator.divide(5, 2));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator.divide(5, 0);
    }

    // 乘法测试
    @Test
    public void testMultiply() {
        assertEquals("常规乘法", 6, Calculator.multiply(2, 3));
        assertEquals("零乘任何数", 0, Calculator.multiply(0, 100));
    }

    // 减法测试
    @Test
    public void testSubtract() {
        assertEquals("大数减小数", 2, Calculator.subtract(5, 3));
        assertEquals("小数减大数", -2, Calculator.subtract(3, 5));
    }
}