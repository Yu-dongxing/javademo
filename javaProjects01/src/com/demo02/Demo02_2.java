package com.demo02;

public class Demo02_2 {
    public static void main(String[] args) {
        // 声明八大数据类型并输出变量中的值

        //整型
        byte num1 = 100;
        short num2 = 200;
        int num3 = 300;
        long num4 = 400L;//数据类型默认是int类型，在这里用小写l或者大写L来标识400是long类型，因为小写字母l和数字1在外型上相似，所以尽量用大写的L来标识

        //浮点型
        float num5 = 12.5f;
        double num6 = 22.5;

        //字符型
        char ch1 = 'a';
        char ch2 = '我';

        //布尔型
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("num1："+num1);
        System.out.println("num2："+num2);
        System.out.println("num3："+num3);
        System.out.println("num4："+num4);
        System.out.println("num5："+num5);
        System.out.println("num6："+num6);
        System.out.println("ch1："+ch1);
        System.out.println("ch2："+ch2);
        System.out.println("bool1："+bool1);
        System.out.println("bool2："+bool2);
    }

}
