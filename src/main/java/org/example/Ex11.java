package org.example;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int ascii = (int) ch;
        System.out.println("Ascii value of " + ch + " is: " + ascii);
    }
}
