package org.example;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] testNumbers = {12, 1234};

        for (int num : testNumbers) {
            String binary = Integer.toBinaryString(num);
            int ones = 0, zeros = 0;

            for (char c : binary.toCharArray()) {
                if (c == '1') ones++;
                else if (c == '0') zeros++;
            }

            System.out.println("Original number: " + num);
            System.out.println("Binary: " + binary);
            System.out.println("Number of ones: " + ones);
            System.out.println("Number of zeros: " + zeros);
        }
    }
}
