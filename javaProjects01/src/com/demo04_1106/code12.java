/*
 * Copyright (c) 2024. YUXS-YuDongXing
 */

package com.demo04_1106;
import java.util.Scanner;
public class code12 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入月份（1-12）：");
            int month = scanner.nextInt();
            switch (month) {
                case 1:
                case 2:
                case 3:
                    System.out.println("这是春季");
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println("这是夏季");
                    break;
                case 7:
                case 8:
                case 9:
                    System.out.println("这是秋季");
                    break;
                case 10:
                case 11:
                case 12:
                    System.out.println("这是冬季");
                    break;
                default:
                    System.out.println("输入的月份不正确");
            }
            scanner.close();
        }
    }
