package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex36 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Today is: " + today.format(formatter));
        System.out.println("The Yesterday was: " + yesterday.format(formatter));
    }
}