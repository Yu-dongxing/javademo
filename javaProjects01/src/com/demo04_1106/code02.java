/*
 * Copyright (c) 2024. YUXS-YuDongXing
 */

package com.demo04_1106;
import java.util.Scanner;
public class code02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // 输入身高
            System.out.println("请输入您的身高（厘米）：");
            int height = scanner.nextInt();
            // 计算理想体重
            double idealWeight = (height - 108) * 2;
            // 计算浮动范围
            double lowerBound = idealWeight - 5; // 下限
            double upperBound = idealWeight + 5; // 上限
            // 输入实际体重
            System.out.println("请输入您的实际体重（公斤）：");
            double actualWeight = scanner.nextDouble();
            // 比较体重
            if (actualWeight >= lowerBound && actualWeight <= upperBound) {
                System.out.println("您的体重在理想范围内，非常合适！");
            } else {
                System.out.println("您的体重不在理想范围内，请适当调整。");
            }

            scanner.close();
        }
}
