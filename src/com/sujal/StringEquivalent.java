package com.sujal;

import java.util.Arrays;

public class StringEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
       String ans =  String.join(" ",word1);
       String ans1 = word1[0].concat(word1[1]);
        System.out.println(ans1);
        System.out.println(ans);

        String name = "SujaL";
        System.out.println(name.toLowerCase());

    }
}
