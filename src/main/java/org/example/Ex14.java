package org.example;

public class Ex14 {
    public static void main(String[] args) {
        int[] arr = {10, -11, 12, -13, 14, -18, 19, -20};
        int pos = 0, neg = 0;

        for (int n : arr) {
            if (n > 0) pos++;
            else if (n < 0) neg++;
        }

        System.out.println("Number of positive numbers: " + pos);
        System.out.println("Number of negative numbers: " + neg);
    }
}
