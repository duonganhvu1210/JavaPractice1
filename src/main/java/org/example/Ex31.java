package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex31 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy h:mm:ss a");

        LocalDateTime date1 = LocalDateTime.parse("8/1/2016 12:00:00 AM", formatter);
        LocalDateTime date2 = LocalDateTime.parse("8/1/2016 12:00:00 PM", formatter);

        if (date1.isBefore(date2)) {
            System.out.println(date1.format(formatter) + " is earlier than " + date2.format(formatter));
        } else {
            System.out.println(date2.format(formatter) + " is earlier than " + date1.format(formatter));
        }
    }
}