package org.example;

import java.util.Scanner;
public class Ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to store in the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The values store into the array are:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nThe values store into the array in reverse are:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}