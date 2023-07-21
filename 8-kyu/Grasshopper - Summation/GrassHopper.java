package org.example.kyu_8.grasshopper_summation;

public class GrassHopper {

    public static int summation(int n) {

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
