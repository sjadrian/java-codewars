package org.example.kyu_7.oddoreven;

public class Codewars {
    public static String oddOrEven (int[] array) {
        return (java.util.Arrays.stream(array).sum() % 2 == 0) ? "even" : "odd";
    }
}
