package org.example.kyu_8.insertvalues;

import java.util.Arrays;

public class Kata {
    public static int[] invert(int[] array) {
        return Arrays.stream(array).map(i -> i * -1).toArray();
    }
}