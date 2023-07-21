package org.example.kyu_7.makeafunctionthatdoesarithmetic;

class ArithmeticFunction {
    public static int arithmetic(int a, int b, String operator) {

        switch (operator) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                return a / b;
            default:
                return -1;
        }
    }
}