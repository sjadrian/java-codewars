package org.example.kyu_8.powersof2;

public class Kata{
    public static long[] powersOfTwo(int n){

        long[] returnArr = new long[n + 1];

        for (int i = 0; i < n + 1; i++) {
            returnArr[i] = (long) Math.pow(2, i);
        }
        return returnArr;
    }
}