/*
 * Copyright (c) 2024. YUXS-YuDongXing
 */

package com.demo04_1106;
import java.util.Scanner;

public class code09 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String username = scanner.next();
            System.out.println("请输入密码：");
            int password = scanner.nextInt();
            if (username.equals("青") && password == 123) {
                System.out.println("欢迎你，青");
            } else {
                System.out.println("对不起，你不是青");
            }
            scanner.close();
        }
    }
