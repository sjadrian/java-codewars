package org.example.kyu_6.countthesmileyfaces;

import java.util.List;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        return (int)arr.stream().filter( x -> x.matches("[:;][-~]?[)D]")).count();
    }
}
