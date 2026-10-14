/*
 * Copyright (c) 2024. YUXS-YuDongXing
 */

package com.demo04_1106;

public class code01 {
        public static void main(String[] args) {
            // 假设有一个4位数
            int number = 1234; // 你可以将这个数字替换为任意的4位数
            int countEven = 0; // 偶数计数器
            int countOdd = 0;  // 奇数计数器

            // 将数字分解为各个位上的数字
            int digit1 = number / 1000; // 千位
            int digit2 = (number % 1000) / 100; // 百位
            int digit3 = (number % 100) / 10; // 十位
            int digit4 = number % 10; // 个位

            // 判断每个位上的数字是奇数还是偶数，并计数
            if (digit1 % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }

            if (digit2 % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }

            if (digit3 % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }

            if (digit4 % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }

            // 输出结果
            System.out.println("偶数个数: " + countEven);
            System.out.println("奇数个数: " + countOdd);
        }
}
