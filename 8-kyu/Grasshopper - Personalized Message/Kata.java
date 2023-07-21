package org.example.kyu_8.grasshopper_personalizedmessage;

class Kata {
    static String greet(String name, String owner) {
        // Add code here
        if (name.equals(owner)) {
            return "Hello boss";
        }
        return "Hello guest";
    }
}