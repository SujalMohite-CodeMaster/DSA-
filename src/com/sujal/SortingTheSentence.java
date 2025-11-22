package com.sujal;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingTheSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String[] sarr = s.split(" ");
        // System.out.println(Arrays.toString(sarr));



        String[] arr = new String[sarr.length];

        for (int i = 0; i < sarr.length; i++) {
            int num = Character.getNumericValue(sarr[i].charAt(sarr[i].length()-1))-1;
            arr[num] = sarr[i].substring(0,sarr[i].length()-1);
        }

        System.out.println(Arrays.toString(arr));

        String ans = String.join(" ",arr);

        System.out.println(ans);




    }
}
