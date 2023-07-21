package org.example.kyu_8.sumarrays;

public class SumArray {

    public static double sum(double[] numbers) {

        double sum = 0.0;
        int i;

        for (i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }
}
