package org.example.collectiondemo;

import java.util.HashMap;
import java.util.Map;

public class Question3 {
    public static char findRepeated(String str) {
     
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (charCountMap.containsKey(currentChar)) {
                charCountMap.put(currentChar, charCountMap.get(currentChar) + 1);
            } else {
                charCountMap.put(currentChar, 1);
            }

        }       
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (charCountMap.get(currentChar) == 1) {
                return currentChar; 
            }
        }
        
        return '\0'; 
    }

    public static void main(String[] args) {
        String str = "aabbccddeffg";
        char result = findRepeated(str);
        if (result != '\0') {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}
