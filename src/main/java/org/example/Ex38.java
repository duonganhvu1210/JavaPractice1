package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the Day: ");
        int day = scanner.nextInt();
        System.out.print("Input the Month: ");
        int month = scanner.nextInt();
        System.out.print("Input the Year: ");
        int year = scanner.nextInt();

        LocalDate date = LocalDate.of(year, month, day);
        LocalDate firstDayNextMonth = date.plusMonths(1).withDayOfMonth(1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("The formatted Date is: " + date.format(formatter));
        System.out.println("The first day of the next month is: " + firstDayNextMonth.format(formatter));
    }
}