package org.example;

import java.util.Scanner;
import java.util.HashMap;
public class Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements to be stored in the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = sc.nextInt();
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println("The unique elements found in the array are :");
        for (int num : arr) {
            if (map.get(num) == 1) {
                System.out.println(num);
            }
        }
    }
}