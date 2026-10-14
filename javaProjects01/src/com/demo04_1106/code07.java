/*
 * Copyright (c) 2024. YUXS-YuDongXing
 */

package com.demo04_1106;
import java.util.Scanner;

public class code07 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入学习成绩：");
            int score = scanner.nextInt();
            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 60) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
            scanner.close();
        }
    }
