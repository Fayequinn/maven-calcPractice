package com.sky;

public class ReverseFactorial {

    public static String reverseTheFactorial(int a){
        int i = 1;
        while (a%i == 0){
            a = a/i;
            if(a==1) return i+"!";
            i += 1;
        }

        return "NONE";
    }
}
