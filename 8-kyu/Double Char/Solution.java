package org.example.kyu_8.doublechar;

public class Solution{
    public static String doubleChar(String s){
        //enter your code here
        String ret = "";
        for (int i = 0; i < s.length(); i++)  {
            ret =  ret + s.charAt(i) + s.charAt(i);
        }

        return ret;
    }
}
