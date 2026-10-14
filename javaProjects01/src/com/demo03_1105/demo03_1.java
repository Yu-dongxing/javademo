package com.demo03_1105;

public class demo03_1 {
    public static final byte BYTE_CONST = 10;
    public static final short SHORT_CONST = 100;
    public static final int INT_CONST = 1000;
    public static final long LONG_CONST = 1000000000L; // 注意L用于表示这是一个长整型常量
    public static final float FLOAT_CONST = 3.14f; // 注意f用于表示这是一个浮点型常量
    public static final double DOUBLE_CONST = 3.14159;
    public static final char CHAR_CONST = 'A';
    public static final boolean BOOLEAN_CONST = true;
    public static void main(String[] args) {
        // 这些常量可以在程序中使用，但不能被修改
        System.out.println(BYTE_CONST);
        System.out.println(SHORT_CONST);
        System.out.println(INT_CONST);
        System.out.println(LONG_CONST);
        System.out.println(FLOAT_CONST);
        System.out.println(DOUBLE_CONST);
        System.out.println(CHAR_CONST);
        System.out.println(BOOLEAN_CONST);
    }
}