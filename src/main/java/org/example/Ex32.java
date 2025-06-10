package org.example;

import java.time.YearMonth;

public class Ex32 {
    public static void main(String[] args) {
        System.out.println(YearMonth.of(2023, 1).lengthOfMonth()); // 31
        System.out.println(YearMonth.of(2023, 2).lengthOfMonth()); // 28
        System.out.println(YearMonth.of(2024, 2).lengthOfMonth()); // 29
    }
}