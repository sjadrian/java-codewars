package org.example.kyu_6.duplicateencoder;

public class DuplicateEncoder {
    static String encode(String word){

        word = word.toLowerCase();
        String returnString = "";
        for (int i = 0, length = word.length(); i < length; i++) {
            char c = word.charAt(i);
            returnString += word.indexOf(c) == word.lastIndexOf(c) ? ")" : "(";
        }
        return returnString;
    }
}
