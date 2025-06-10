package org.example;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a date and time.");
        String localTime = scanner.nextLine();

        LocalDateTime ldt = LocalDateTime.parse("2016-08-23T01:57:00");
        ZonedDateTime localZdt = ldt.atZone(ZoneId.systemDefault());
        ZonedDateTime utcZdt = localZdt.withZoneSameInstant(ZoneId.of("UTC"));

        System.out.println(ldt.format(DateTimeFormatter.ofPattern("M/d/yyyy h:mm:ss a")) +
                " local time is " +
                utcZdt.format(DateTimeFormatter.ofPattern("M/d/yyyy h:mm:ss a")) +
                " universal time.");
    }
}