/*
 * Copyright (c) 2024. YUXS-YuDongXing
 */

package com.demo03_1105;

public class demo03_8 {
        public static void main(String[] args) {
            int a = 5;
            int b = 2;
            int c = 8;

            // 使用if选择结构对三个整数进行排序
            if (a > b) {
                if (a > c) {
                    if (b > c) {
                        System.out.println(b + " " + c + " " + a);
                    } else {
                        System.out.println(c + " " + b + " " + a);
                    }
                } else {
                    System.out.println(c + " " + a + " " + b);
                }
            } else {
                if (b > c) {
                    if (a > c) {
                        System.out.println(a + " " + c + " " + b);
                    } else {
                        System.out.println(c + " " + a + " " + b);
                    }
                } else {
                    System.out.println(a + " " + b + " " + c);
                }
            }
        }
    }
