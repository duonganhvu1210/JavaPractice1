package org.example;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 25};  // Replace with any array
        System.out.print("Input an integer: ");
        int n = sc.nextInt();

        boolean found = arr[0] == n || arr[arr.length - 1] == n;
        System.out.println(found);
    }
}
