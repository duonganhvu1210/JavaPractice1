package org.example;

public class Ex12 {
    public static void main(String[] args) {
        String str = "50";
        int num = 122;

        // String to int
        int intFromString = Integer.parseInt(str);
        System.out.println("Original value and type: " + str + ", String");
        System.out.println("Convert string to integer: " + intFromString + ", int");

        // Int to String
        String strFromInt = Integer.toString(num);
        System.out.println("Original value and type: " + num + ", int");
        System.out.println("Convert integer to string: " + strFromInt + ", String");
    }
}
