package org.example;

import java.time.Month;
import java.time.LocalDate;

public class Ex37 {
    public static void main(String[] args) {
        System.out.println("The twelve months are:");

        int currentMonth = LocalDate.now().getMonthValue();
        for (int i = 0; i < 12; i++) {
            Month month = Month.of((currentMonth + i - 1) % 12 + 1);
            System.out.println(month.toString().substring(0, 3));
        }
    }
}