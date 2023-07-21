package org.example.kyu_7.twotoone;

public class TwoToOne {

    public static String longest (String s1, String s2) {
        // your code
        StringBuilder sb = new StringBuilder();
        (s1 + s2).chars().distinct().sorted().forEach(c -> sb.appendCodePoint(c));
        return sb.toString();
    }
}
