package org.example.kyu_8.expressionmatter;

public class Kata
{
    public static int expressionsMatter(int a, int b, int c)
    {
        int total = 0;


        // check if only b is 1 (intermediate value)
        if (a != 1 && b == 1 && c != 1) {
            // check if a is bigger than c
            if (a > c) {
                return a * (b + c);
            } else {return (a + b) * c;}
        }

        // check if only a is 1 (intermediate value)
        if (a == 1 && b != 1 && c != 1) {
            // check if a is bigger than c
            return ((a + b) * c);
        }

        // check if only c is 1 (intermediate value)
        if (a != 1 && b != 1 && c == 1) {
            // check if a is bigger than c
            return (a * (b + c));
        }

        // check for mixed values of 1
        if (a == 1 && b == 1 && c != 1) {
            return (a + b) * c;
        }
        // check for mixed values of 1
        if (b == 1 && c == 1 && a != 1) {
            return a * (b + c);
        }

        // check if a or b is 1
        if (a == 1 || b == 1) {
            total = a + b;
        } else {total = a * b;}

        // check if c is 1
        if (c == 1) {
            total += c;
        } else {total *= c;}

        return total;
    }
}