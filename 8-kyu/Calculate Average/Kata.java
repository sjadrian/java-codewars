package org.example.kyu_8.calculateaverage;

public class Kata{
    public static double find_average(int[] array){
        return java.util.Arrays.stream(array).average().orElse(0);
    }
}
