/*
 * Copyright (c) 2024. YUXS-YuDongXing
 */

package com.demo04_1106;
import java.util.Scanner;

public class code08 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入岳灵珊的考试成绩：");
            int score = scanner.nextInt();
            if (score == 100) {
                System.out.println("父亲给她买辆车");
            } else if (score >= 90) {
                System.out.println("母亲给她买台笔记本电脑");
            } else if (score >= 60) {
                System.out.println("母亲给她买部手机");
            } else {
                System.out.println("没有礼物");
            }
            scanner.close();
        }
    }
