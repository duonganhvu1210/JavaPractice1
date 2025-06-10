package org.example;

import java.util.Scanner;

public class Ex2 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter another number: ");
        int num2 = sc.nextInt();
        System.out.println("The sum of two numbers is : " + sum(num1, num2));
    }
}
