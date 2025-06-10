package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex34 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2010, 1, 1);
        LocalDate date2 = LocalDate.of(2016, 3, 1);

        long diff = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Difference in days: " + diff);
    }
}