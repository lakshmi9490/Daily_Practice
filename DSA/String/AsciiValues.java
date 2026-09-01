package com.java.string;

public class AsciiValues {
    public static void printAsciiValues(String s) {
        for (char c : s.toCharArray()) {
            System.out.println(c + " -> " + (int)c);
        }
    }

    public static void main(String[] args) {
        String s1 = "AB";
        String s2 = "Java";

        System.out.println("ASCII values for '" + s1 + "':");
        printAsciiValues(s1);

        System.out.println("\nASCII values for '" + s2 + "':");
        printAsciiValues(s2);
    }
}
