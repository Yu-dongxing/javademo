/*
 * Copyright (c) 2024. YUXS-YuDongXing
 */

package com.demo03_1105;

public class demo03_4 {
    public static void main(String[] args) {
        char char1 = 'A'; // 第一个字符
        char char2 = 'B'; // 第二个字符
        // 加法：字符的ASCII码值相加，结果转换为字符
        char sum = (char) (char1 + char2);
        System.out.println("加法结果: " + sum);
        // 减法：字符的ASCII码值相减，结果转换为字符
        char difference = (char) (char1 - char2);
        System.out.println("减法结果: " + difference);
        // 乘法：字符的ASCII码值相乘，结果转换为字符
        char product = (char) (char1 * char2);
        System.out.println("乘法结果: " + product);
        // 除法：字符的ASCII码值相除，结果转换为字符
        char quotient = (char) (char1 / char2);
        System.out.println("除法结果: " + quotient);
    }
}
