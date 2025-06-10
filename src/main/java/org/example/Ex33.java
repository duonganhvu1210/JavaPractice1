package org.example;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Ex33 {
    public static void main(String[] args) {
        long windowsTime = 128166375120000000L; // Example Windows file time
        Instant instant = Instant.ofEpochSecond((windowsTime - 116444736000000000L) / 10000000);
        LocalDateTime utc = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);

        System.out.println(utc.format(DateTimeFormatter.ofPattern("M/d/yyyy h:mm:ss a")));
    }
}