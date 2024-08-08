package com.example;

public class Calculator {
    public int add(int a, int b) {
        // 假设我们想要修复的错误是防止整数溢出
        long result = (long) a + (long) b;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new ArithmeticException("整数溢出");
        }
        return (int) result;
    }
}
