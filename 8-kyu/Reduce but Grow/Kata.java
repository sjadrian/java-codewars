package org.example.kyu_8.reducebutgrow;

public class Kata{

    public static int grow(int[] x){

        int total = 1;
        for (int num: x) {
            total *= num;
        }
        return total;
    }
}