package com.java.string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
    public static void printDuplicates(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

    public static void main(String[] args) {
        String s = "programming";
        System.out.print("Duplicates: ");
        printDuplicates(s);
    }

}

