package org.example;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int n = sc.nextInt();
        int sum = 0;

        System.out.print("The even numbers are: ");
        for (int i = 1; i <= n; i++) {
            int even = 2 * i;
            System.out.print(even + " ");
            sum += even;
        }
        System.out.println("\nThe Sum of even Natural Number up to " + n + " terms: " + sum);
    }
}
