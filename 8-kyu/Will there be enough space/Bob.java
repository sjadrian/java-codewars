package org.example.kyu_8.willtherebeenoughspace;

public class Bob {
    public static int enough(int cap, int on, int wait){
        // your code here
        return Math.max(0, wait + on - cap);
    }
}
