package org.example.kyu_7.testing123;

import java.util.Arrays;
import java.util.List;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        int counter = 1;
        for (String row: lines) {
            lines.set(counter - 1, counter + ": " + row);
            counter++;
        }
        return lines;
    }
}
