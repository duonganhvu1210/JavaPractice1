package org.example;

public class Ex7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8};
        int first = arr[0];
        arr[0] = arr[1];
        arr[1] = arr[2];
        arr[2] = first;

        System.out.print("After rotating array becomes: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
