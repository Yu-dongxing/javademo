/*
 * Copyright (c) 2024. YUXS-YuDongXing
 */

package com.demo03_1105;

public class demo03_9 {
        public static void main(String[] args) {
            int number = 153; // 你可以将这个数替换为任意三位数进行测试

            // 提取百位、十位和个位数字
            int hundreds = number / 100;
            int tens = (number / 10) % 10;
            int ones = number % 10;

            // 计算各位数字的立方和
            int sumOfCubes = (int)(Math.pow(hundreds, 3) + Math.pow(tens, 3) + Math.pow(ones, 3));

            // 使用if选择结构判断是否是水仙花数
            if (sumOfCubes == number) {
                System.out.println(number + " 是水仙花数。");
            } else {
                System.out.println(number + " 不是水仙花数。");
            }
        }

}
