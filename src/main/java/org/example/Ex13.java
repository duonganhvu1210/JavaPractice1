package org.example;

public class Ex13 {
    public static String removeVowels(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        String[] testStrings = {"Python", "C Sharp", "JavaScript"};

        for (String s : testStrings) {
            System.out.println("Original string: " + s);
            System.out.println("After removing all the vowels: " + removeVowels(s));
        }
    }
}
