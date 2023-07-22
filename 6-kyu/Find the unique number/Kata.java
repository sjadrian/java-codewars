package org.example.kyu_6.findtheuniquenumber;

// Make sure your class is public
public class Kata {
    public static double findUniq(double arr[]) {
        double num = arr[0];

        // first number is the unique number
        if (num != arr[1] && num != arr[2]) {
            return num;
        }

        // first number is not the unique number
        for (int i = 1; i < arr.length ; i++) {
            if (num != arr[i]) {
                return arr[i];
            }
        }

        return arr[0];
    }
}
