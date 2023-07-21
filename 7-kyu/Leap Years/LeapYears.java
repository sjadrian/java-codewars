package org.example.kyu_7.leapyears;

import java.time.Year;

public class LeapYears {

    public static boolean isLeapYear(int year) {
        return Year.of(year).isLeap();
    }
}
