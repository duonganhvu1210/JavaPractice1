package org.example;

public class Ex9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 5, 6, 5, 7, 7, 7, 8, 8, 1};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum: " + sum);
    }
}
