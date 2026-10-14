/*
 * Copyright (c) 2024. YUXS-YuDongXing
 */

package com.demo05_1107;
import java.util.Scanner;
import java.util.Random;

public class code01_10 {
        public static void code01(){
            int sum = 0;
            for (int i = 2; i <= 10; i += 2) {
                sum += i;
            }
            System.out.println("10以内的偶数和为: " + sum);
        }
        public static void code02() {
            for (int i = 2; i <= 100; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }

        public static boolean isPrime(int num) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }


        public static void code03(){
            Random random = new Random();
            int numberToGuess = random.nextInt(100) + 1;
            int guess = 0;
            int attempts = 0;
            Scanner scanner = new Scanner(System.in);
            while (attempts < 7) {
                System.out.print("猜一个1-100之间的数字: ");
                guess = scanner.nextInt();
                attempts++;
                if (guess > numberToGuess) {
                    System.out.println("大了");
                } else if (guess < numberToGuess) {
                    System.out.println("小了");
                } else {
                    System.out.println("猜对了! 你用了" + attempts + "次");
                    break;
                }
            }
            scanner.close();
        }
        //
            public static void code04() {
                for (int i = 100; i <= 999; i++) {
                    if (isNarcissistic(i)) {
                        System.out.print(i + " ");
                    }
                }
            }

            public static boolean isNarcissistic(int num) {
                int originalNum = num;
                int sum = 0;
                while (num > 0) {
                    int digit = num % 10;
                    sum += Math.pow(digit, 3);
                    num /= 10;
                }
                return sum == originalNum;
            }
        //
            public static void code05() {
                for (char c = 'a'; c <= 'z'; c++) {
                    System.out.print(c + " ");
                }
                System.out.println();
                for (char c = 'Z'; c >= 'A'; c--) {
                    System.out.print(c + " ");
                }
            }
        //

            public static void code06() {
                int sum = 0;
                for (int i = 1; i <= 101; i += 2) {
                    if (i % 4 == 1) {
                        sum += i;
                    } else {
                        sum -= i;
                    }
                }
                System.out.println("和为: " + sum);
            }


        public static void code07() {
            double sum = 0;
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 1) {
                    sum += 1.0 / i;
                } else {
                    sum -= 1.0 / i;
                }
            }
            System.out.println("和为: " + sum);
        }


        public static void code08() {
            int count = 0;
            for (int i = 20; i <= 80; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                    count++;
                    if (count % 5 == 0) {
                        System.out.println();
                    }
                }
            }
        }

        public static void code09() {
            int count = 0;
            for (int year = 1000; year <= 2000; year++) {
                if (isLeapYear(year)) {
                    System.out.print(year + " ");
                    count++;
                    if (count % 4 == 0) {
                        System.out.println();
                    }
                }
            }
        }

        public static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }


        public static void code10() {
            for (int a = 0; a <= 9; a++) {
                for (int b = 0; b <= 9; b++) {
                    if (a + b == 12) {
                        System.out.println("a = " + a + ", b = " + b);
                    }
                }
            }
        }



}
