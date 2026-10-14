/*
 * Copyright (c) 2024. YUXS-YuDongXing
 */

package com.demo03_1105;

public class demo03_6 {
    public static void main(String[] args) {
        int totalHours = 89; // 总小时数
        int days = totalHours / 24; // 计算天数
        int hours = totalHours % 24; // 计算剩余小时数
        System.out.println("共 " + days + " 天零 " + hours + " 小时");
    }
}
