/*
 * Copyright (c) 2024. YUXS-YuDongXing
 */

package com.demo04_1106;
import java.util.Scanner;

public class code05 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 输入三个整数
            System.out.println("请输入三个整数作为三角形的边长：");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            // 检查是否能构成三角形
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("可以构成三角形。");

                // 判断三角形的类型
                if (a == b && b == c) {
                    System.out.println("这是一个等边三角形。");
                } else if (a == b || a == c || b == c) {
                    System.out.println("这是一个等腰三角形。");
                } else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) ||
                        Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2) ||
                        Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) {
                    System.out.println("这是一个直角三角形。");
                } else {
                    System.out.println("这是一个普通三角形。");
                }

                // 计算三角形的面积
                double s = (a + b + c) / 2.0;
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println("三角形的面积是：" + area);
            } else {
                System.out.println("不能构成三角形。");
            }

            scanner.close();
        }
    }
