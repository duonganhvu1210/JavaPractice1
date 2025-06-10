package org.example;

import java.util.Scanner;

public class Ex3 {
    public static int countSpaces(String text) {
        int count = 0;
        for (char ch : text.toCharArray()) {
            if (ch == ' ') count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input a string : ");
        String input = sc.nextLine();
        int spaces = countSpaces(input);
        System.out.println("\"" + input + "\" contains " + spaces + " spaces");
    }
}
