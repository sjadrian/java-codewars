package org.example.kyu_8.correctthemistakesofthecharacterrecognitionsoftware;

public class Correct {
    public static String correct(String string) {
        return string.replaceAll("5", "S").replaceAll("0", "O").replaceAll("1", "I");
    }
}
