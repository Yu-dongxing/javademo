/*
 * Copyright (c) 2024. YUXS-YuDongXing
 */

package com.demo05_1107;

public class code21_30 {
        public static void code21() {
            int count = 0;
            for (int i = 100; i <= 1000; i++) {
                if (i % 5 == 0 && i % 6 == 0) {
                    System.out.print(i + " ");
                    count++;
                    if (count % 5 == 0) {
                        System.out.println();
                    }
                }
            }
        }

        public static void code22() {
            double sum = 0;
            for (int i = 1; i <= 97; i += 2) {
                sum += (double)i / (i + 2);
            }
            System.out.println("和为: " + sum);
        }


        public static void code23() {
            int sum = 0;
            int count = 0;
            for (int i = 2; i <= 100; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                    sum += i;
                    count++;
                    if (count % 5 == 0) {
                        System.out.println();
                    }
                }
            }
            System.out.println("100以内所有素数的和为: " + sum);
        }

        public static boolean isPrime(int num) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }




        public static void Code24() {
            int water = 15;
            int trips = 0;

            while (water < 50) {
                water += 5;
                trips++;
            }
            System.out.println("小和尚需要挑水 " + trips + " 次才能把水缸挑满。");
        }



        public static void code25() {
            int wine = 0;
            for (int i = 1; i <= 5; i++) {
                if (i % 2 == 1) { // 遇店加一倍
                    wine *= 2;
                } else { // 见花喝一斗
                    wine -= Math.min(wine, 1); // 确保不会喝超过当前的酒量
                }
            }
            System.out.println("李白壶中原有 " + wine + " 斗酒");
        }




        public static void code26(){
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("FlipFlop ");
                } else if (i % 3 == 0) {
                    System.out.print("Flip ");
                } else if (i % 5 == 0) {
                    System.out.print("Flop ");
                } else {
                    System.out.print(i + " ");
                }
            }
        }




        public static void code27() {
            String barcode = "6922233612"; // 假设这是输入的12位条码
            String ean13 = generateEAN13(barcode);
            System.out.println("生成的EAN-13条码为: " + ean13);
        }

        public static String generateEAN13(String barcode) {
            int oddSum = 0, evenSum = 0;
            for (int i = 0; i < 12; i++) {
                int digit = Integer.parseInt(barcode.substring(i, i + 1));
                if (i % 2 == 0) oddSum += digit;
                else evenSum += digit;
            }
            int total = oddSum + evenSum * 3;
            int checkDigit = 10 - (total % 10);
            if (checkDigit == 10) checkDigit = 0;
            return barcode + Integer.toString(checkDigit);
        }



        public static void code28() {
            int num1 = 36, num2 = 60;
            int gcd = greatestCommonDivisor(num1, num2);
            int lcm = (num1 * num2) / gcd;
            System.out.println("最大公约数: " + gcd);
            System.out.println("最小公倍数: " + lcm);
        }

        public static int greatestCommonDivisor(int a, int b) {
            return b == 0 ? a : greatestCommonDivisor(b, a % b);
        }



        public static void code29(){
            int[] denominations = {1, 5, 10}; // 面额数组
            int total = 100; // 总金额
            int combinations = 0;
            for (int i = 0; i <= total / denominations[2]; i++) {
                for (int j = 0; j <= total / denominations[1]; j++) {
                    int k = total - i * denominations[2] - j * denominations[1];
                    if (k >= 0 && k % denominations[0] == 0) {
                        combinations++;
                    }
                }
            }
            System.out.println("兑换方法总数: " + combinations);
        }


        public static void code30(){
            int totalBills = 50; // 总张数
            int totalMoney = 100; // 总金额
            int[] denominations = {10, 5, 1}; // 面额数组
            int[] count = new int[3]; // 每种面额的张数
            int solutions = 0;

            for (count[0] = 1; count[0] < totalBills; count[0]++) {
                for (count[1] = 1; count[1] < totalBills - count[0]; count[1]++) {
                    count[2] = totalBills - count[0] - count[1];
                    if (count[0] * denominations[0] + count[1] * denominations[1] + count[2] * denominations[2] == totalMoney) {
                        solutions++;
                    }
                }
            }
            System.out.println("兑换方案总数: " + solutions);
        }

}
