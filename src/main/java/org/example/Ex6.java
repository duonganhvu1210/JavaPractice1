package org.example;

public class Ex6 {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 7, 8};
        int max = Math.max(array[0], array[array.length - 1]);
        System.out.println("Highest value between first and last values of the said array: " + max);
    }
}
