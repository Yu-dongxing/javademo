/*
 * Copyright (c) 2024. YUXS-YuDongXing
 */

package com.demo04_1106;
import java.util.Scanner;
public class code03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // 输入考试成绩
            System.out.println("请输入您的考试成绩：");
            int score = scanner.nextInt();
            // 判断考试成绩的等级
            if (score >= 90) {
                System.out.println("优秀");
            } else if (score >= 80) {
                System.out.println("优良");
            } else if (score >= 70) {
                System.out.println("良好");
            } else if (score >= 60) {
                System.out.println("及格");
            } else {
                System.out.println("不及格");
            }
            scanner.close();
        }
    }
