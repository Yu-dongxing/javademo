/*
 * Copyright (c) 2024. YUXS-YuDongXing
 */

package com.demo05_1107;

public class code31_40 {
    public static void code31() {
        int totalBottles = 50;
        int emptyBottles = totalBottles;
        int newBottles = 0;

        while (emptyBottles >= 3) {
            newBottles = emptyBottles / 3;
            totalBottles += newBottles;
            emptyBottles = emptyBottles % 3 + newBottles;
        }

    }
}
