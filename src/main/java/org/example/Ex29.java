package org.example;

import java.util.Calendar;

public class Ex29 {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        System.out.println("year = " + now.get(Calendar.YEAR));
        System.out.println("month = " + (now.get(Calendar.MONTH) + 1));
        System.out.println("day = " + now.get(Calendar.DAY_OF_MONTH));
        System.out.println("hour = " + now.get(Calendar.HOUR_OF_DAY));
        System.out.println("minute = " + now.get(Calendar.MINUTE));
        System.out.println("second = " + now.get(Calendar.SECOND));
        System.out.println("millisecond = " + now.get(Calendar.MILLISECOND));
    }
}