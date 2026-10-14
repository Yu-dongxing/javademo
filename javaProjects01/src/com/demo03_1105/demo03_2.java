/*
 * Copyright (c) 2024. YUXS-YuDongXing
 */

package com.demo03_1105;

public class demo03_2 {
    // 定义byte类型的变量
    byte byteVar;
    // 定义short类型的变量
    short shortVar;
    // 定义int类型的变量
    int intVar;
    // 定义long类型的变量
    long longVar;
    // 定义float类型的变量
    float floatVar;
    // 定义double类型的变量
    double doubleVar;
    // 定义char类型的变量
    char charVar;
    // 定义boolean类型的变量
    boolean booleanVar;

    public static void main(String[] args) {
        // 实例化PrimitiveVariables类并初始化变量
        demo03_2 pv = new demo03_2();

        // 初始化变量
        pv.byteVar = 10;
        pv.shortVar = 100;
        pv.intVar = 1000;
        pv.longVar = 1000000000L; // L表示这是一个long类型的字面量
        pv.floatVar = 3.14f; // f表示这是一个float类型的字面量
        pv.doubleVar = 3.14159;
        pv.charVar = 'A';
        pv.booleanVar = true;

        // 打印变量值
        System.out.println("byteVar: " + pv.byteVar);
        System.out.println("shortVar: " + pv.shortVar);
        System.out.println("intVar: " + pv.intVar);
        System.out.println("longVar: " + pv.longVar);
        System.out.println("floatVar: " + pv.floatVar);
        System.out.println("doubleVar: " + pv.doubleVar);
        System.out.println("charVar: " + pv.charVar);
        System.out.println("booleanVar: " + pv.booleanVar);
    }
}
