/*
 * Copyright (c) 2024. YUXS-YuDongXing
 */

package com.demo03_1105;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class demo03_10 {
        public static void main(String[] args) {
//            new Scanner().
            int year = 2024; // 你可以将这个年份替换为任意年份进行测试

            // 使用if选择结构判断是否是闰年
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " 是闰年。");
            } else {
                System.out.println(year + " 不是闰年。");
            }
        }
}
