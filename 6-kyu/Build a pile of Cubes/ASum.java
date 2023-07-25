package org.example.kyu_6.buildapileofcubes;

public class ASum {

    public static long findNb(long m) {

        long i = 1L;
        long sum = 1L;

        while (sum <= m) {
            if (sum == m) {
                return i;
            }

            i++;
            sum += i * i * i;
        }
        return -1;
    }
}
