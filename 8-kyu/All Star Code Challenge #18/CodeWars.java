package org.example.kyu_8.allstarcodechallenge18;

public class CodeWars {
    public static int strCount(String str, char letter) {
        //write code here
        int count = 0;

        for (int i = 0, length = str.length(); i < length; i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}
