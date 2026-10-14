/*
 * Copyright (c) 2024. YUXS-YuDongXing
 */

package com.demo04_1106;
import java.util.Scanner;

public class code06 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个字母：");
            char letter = scanner.next().charAt(0);
            if (Character.isUpperCase(letter)) {
                System.out.println(Character.toLowerCase(letter));
            } else {
                System.out.println(Character.toUpperCase(letter));
            }
            scanner.close();
        }
    }
