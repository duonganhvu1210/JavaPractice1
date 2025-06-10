package org.example;

import java.util.Scanner;

public class Ex23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int n = sc.nextInt();
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            System.out.print("1/" + i);
            if (i != n) System.out.print(" + ");
            sum += 1.0 / i;
        }
        System.out.printf("\nSum of Series up to %d terms: %.6f\n", n, sum);
    }
}
