package com.demo04_1106;
import java.util.Scanner;

public class code11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年、月、日（格式为YYYY-MM-DD）：");
        String input = scanner.next();
        int year = Integer.parseInt(input.substring(0, 4));
        int month = Integer.parseInt(input.substring(5, 7));
        int day = Integer.parseInt(input.substring(8, 10));
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dayOfYear = day;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }
        if (month > 2 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            dayOfYear += 1; // 闰年2月多一天
        }
        System.out.println("这是这一年的第 " + dayOfYear + " 天。");
        scanner.close();
    }
}