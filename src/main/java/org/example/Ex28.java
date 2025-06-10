package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex28 {
    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat complete = new SimpleDateFormat("M/d/yyyy hh:mm:ss a");
        SimpleDateFormat shortDate = new SimpleDateFormat("M/d/yyyy");
        SimpleDateFormat clock24 = new SimpleDateFormat("M/d/yyyy HH:mm");
        SimpleDateFormat padded24 = new SimpleDateFormat("MM/dd/yyyy HH:mm");

        System.out.println("Complete date: " + complete.format(date));
        System.out.println("Short Date: " + shortDate.format(date));
        System.out.println("Display date using 24-hour clock format:");
        System.out.println(clock24.format(date));
        System.out.println(padded24.format(date));
    }
}
