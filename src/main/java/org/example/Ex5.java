package org.example;

public class Ex5 {
    public static void main(String[] args) {
        int[] array = {2, 4, 7, 8, 6};
        boolean hasOdd = false;

        for (int num : array) {
            if (num % 2 != 0) {
                hasOdd = true;
                break;
            }
        }

        System.out.println("Check if an array contains an odd number? " + hasOdd);
    }
}
