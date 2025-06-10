package org.example;

import java.util.Scanner;

public class Ex1 {
    public static void welcome(String name) {
        System.out.println("Welcome friend " + name + " !");
        System.out.println("Have a nice day!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input a name : ");
        String name = sc.nextLine();
        welcome(name);
    }
}
