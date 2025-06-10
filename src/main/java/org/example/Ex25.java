package org.example;

import java.util.Scanner;
public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Elements in array are: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}