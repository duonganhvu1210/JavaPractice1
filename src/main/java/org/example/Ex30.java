package org.example;

import java.time.LocalDate;
import java.time.Year;

public class Ex30 {
    public static void main(String[] args) {
        int startYear = 2001;
        int endYear = 2008;

        for (int year = startYear; year <= endYear; year++) {
            LocalDate date = LocalDate.of(year, 12, 31);
            int days = date.getDayOfYear();
            boolean isLeap = Year.of(year).isLeap();

            System.out.printf("12/31/%d: day %d of %d", year, days, year);
            if (isLeap) {
                System.out.print(" (Leap Year)");
            }
            System.out.println();
        }
    }
}