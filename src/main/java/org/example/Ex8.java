package org.example;

public class Ex8 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 3, 4, 5, 6, 5, 7, 7, 7, 8, 8, 1};
        int[] arr2 = {1, 2, 2, 3, 3, 4, 5, 6, 5, 7, 7, 7, 8, 8, 5};

        boolean result = arr1[0] == arr2[0] || arr1[arr1.length - 1] == arr2[arr2.length - 1];
        System.out.println("Check if the first or the last element of the two arrays are equal: " + result);
    }
}
