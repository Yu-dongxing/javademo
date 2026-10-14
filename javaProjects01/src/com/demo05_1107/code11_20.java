/*
 * Copyright (c) 2024. YUXS-YuDongXing
 */

package com.demo05_1107;
import java.util.Random;

public class code11_20 {

        public static void code11(){
            for (int a = 0; a <= 9; a++) {
                for (int b = 0; b <= 9; b++) {
                    for (int c = 0; c <= 9; c++) {
                        for (int d = 0; d <= 9; d++) {
                            if (Integer.parseInt(a + "" + b) + Integer.parseInt(c + "" + d) == Integer.parseInt(d + "" + a)) {
                                System.out.println("AB = " + a + b + ", CD = " + c + d + ", DA = " + d + a);
                            }
                        }
                    }
                }
            }
        }




        public static void code12() {
            Random random = new Random();
            int number = random.nextInt(100000); // 生成0到99999之间的随机数
            System.out.println("数字有 " + String.valueOf(number).length() + " 位");
            System.out.print("每位数字分别是：");
            while (number > 0) {
                System.out.print(number % 10 + " ");
                number /= 10;
            }
        }



        public static void code13() {
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + "*" + i + "=" + (i * j) + "\t");
                }
                System.out.println();
            }
        }




        public static void code14(){
            int n = 5; // 菱形的行数
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = n - 1; i >= 1; i--) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }





        public static void code15() {
            Random random = new Random();
            int[] redBalls = new int[6];
            int[] blueBalls = new int[1];

            for (int i = 0; i < 6; i++) {
                int num;
                do {
                    num = random.nextInt(36) + 1;
                } while (contains(redBalls, num, i));
                redBalls[i] = num;
            }

            blueBalls[0] = random.nextInt(15) + 1;

            System.out.println("红球: " + java.util.Arrays.toString(redBalls) + " 蓝球: " + blueBalls[0]);
        }

        private static boolean contains(int[] array, int value, int index) {
            for (int i = 0; i < index; i++) {
                if (array[i] == value) {
                    return true;
                }
            }
            return false;
        }



        public static void code16() {
            int count = 0;
            for (int i = 1; i <= 100; i++) {
                if (i % 5 != 0) {
                    System.out.print(i + " ");
                    count++;
                    if (count % 5 == 0) {
                        System.out.println();
                    }
                }
            }
        }




        public static void code17(){
            int first = 0, second = 1;
            System.out.print(first + " " + second + " ");
            int count = 2;
            while (count < 20) {
                int next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
                count++;
            }
        }



        public static void code18() {
            int number = 156; // 示例数字
            System.out.println("二进制: " + Integer.toBinaryString(number));
            System.out.println("八进制: " + Integer.toOctalString(number));
            System.out.println("十六进制: " + Integer.toHexString(number));
        }





        public static void code19() {
            Random random = new Random();
            char letter = (char) (random.nextInt(26) + 'A');
            if (letter >= 'A' && letter <= 'Z') {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }





        public static void code20(){
            Random random = new Random();
            char ch = (char) (random.nextInt(256));
            if (Character.isUpperCase(ch)) {
                System.out.println("大写字母");
            } else if (Character.isLowerCase(ch)) {
                System.out.println("小写字母");
            } else {
                System.out.println("其他字符");
            }
        }
    }

