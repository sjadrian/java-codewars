package org.example.kyu_8.sumofpositive;

import java.util.Arrays;

public class Positive{

    public static int sum(int[] arr){
        return  Arrays.stream(arr).filter(a -> a > 0).sum();
    }

}
