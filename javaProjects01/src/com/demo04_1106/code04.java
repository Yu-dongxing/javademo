/*
 * Copyright (c) 2024. YUXS-YuDongXing
 */

package com.demo04_1106;
import java.util.Scanner;

public class code04 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 循环直到用户输入正确的时间
            while (true) {
                System.out.println("请输入时间（格式为HH:MM:SS，例如09:03:12）：");
                String input = scanner.next();

                // 检查输入格式是否正确
                if (input.length() != 8 || input.charAt(2) != ':' || input.charAt(5) != ':') {
                    System.out.println("输入格式错误，请按照HH:MM:SS格式输入。");
                    continue;
                }

                // 提取小时、分钟和秒
                int hours = Integer.parseInt(input.substring(0, 2));
                int minutes = Integer.parseInt(input.substring(3, 5));
                int seconds = Integer.parseInt(input.substring(6, 8));

                // 检查时间是否合理
                if (hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60 && seconds >= 0 && seconds < 60) {
                    // 输出正确格式的时间
                    System.out.println("正确的时间格式为：" + String.format("%02d:%02d:%02d", hours, minutes, seconds));
                    break; // 退出循环
                } else {
                    System.out.println("输入的时间不合理，请确保小时数在0-23之间，分钟数和秒数在0-59之间。");
                }
            }

            scanner.close();
        }
}
