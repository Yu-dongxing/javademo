/*
 * Copyright (c) 2024. YUXS-YuDongXing
 */

package com.demo03_1105;

public class demo03_3 {
    public static void main(String[] args) {
        int num1 = 10; // 第一个整数
        int num2 = 5;  // 第二个整数
        // 加法
        int sum = num1 + num2;
        System.out.println("加法结果: " + sum);
        // 减法
        int difference = num1 - num2;
        System.out.println("减法结果: " + difference);
        // 乘法
        int product = num1 * num2;
        System.out.println("乘法结果: " + product);
        // 除法
        // 注意：整数除法会向下取整
        int quotient = num1 / num2;
        System.out.println("除法结果（整数）: " + quotient);
        // 取余
        int remainder = num1 % num2;
        System.out.println("取余结果: " + remainder);
    }
}
