package org.example.kyu_7.complementarydna;

public class DnaStrand {
    public static String makeComplement(String dna) {

        String ret = "";
        for (char ch: dna.toCharArray()) {
            switch (ch) {
                case 'A':
                    ret += "T";
                    break;
                case 'T':
                    ret += "A";
                    break;
                case 'C':
                    ret += "G";
                    break;
                case 'G':
                    ret += "C";
                    break;
            }
        }
        return ret;
    }
}
