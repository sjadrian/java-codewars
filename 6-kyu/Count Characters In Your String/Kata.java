package org.example.kyu_6.count_characters_in_your_string;

import java.util.Map;
import java.util.HashMap;

public class Kata {
    public static Map<Character, Integer> count(String str) {
        // Happy coding!
        Map<Character, Integer> returnMap = new HashMap<>();

        // check if string is empty
        if (str.isEmpty()) {return returnMap;}

        // go through each character
        for (char c: str.toCharArray()) {
            if (!returnMap.containsKey(c)) {
                returnMap.put(c, 1);
            } else {
                returnMap.put(c, returnMap.get(c) + 1);
            }
        }
        return returnMap;
    }
}
