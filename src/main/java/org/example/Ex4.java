package org.example;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        System.out.println("Input 5 elements in the array:");
        for (int i = 0; i < 5; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("The sum of the elements of the array is " + sum);
    }
}
