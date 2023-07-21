package org.example.kyu_7.descendingorder;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        //Your code

        String numString = String.valueOf(num)
                .chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .reverse()
                .toString();

        return Integer.valueOf(numString);
    }
}
