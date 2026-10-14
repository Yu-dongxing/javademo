/*
 * Copyright (c) 2024. YUXS-YuDongXing
 */

package com.demo04_1106;
import java.util.Scanner;

public class code10 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入a, b, c的值：");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            double discriminant = b * b - 4 * a * c;
            if (discriminant > 0) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("方程有两个解：x1 = " + x1 + ", x2 = " + x2);
            } else if (discriminant == 0) {
                double x = -b / (2 * a);
                System.out.println("方程有一个解：x = " + x);
            } else {
                System.out.println("方程无解");
            }
            scanner.close();
        }
    }
