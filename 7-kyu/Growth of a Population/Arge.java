package org.example.kyu_7.growthpopulation;

class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int count = 0;
        while(p0 < p) {
            p0 =  (int) (p0 * (1 + percent / 100)) + aug;
            count++;
        }
        return count;
    }
}
