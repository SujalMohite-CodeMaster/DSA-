package com.sujal;

public class EmptySpaces {
    public static void main(String[] args) {
        String s = "Hello welcome to javaWorld ";
        // remove trailing (back) spaces.
         s = s.trim();
        System.out.println(s);
        // Find last space
        int lastSpaceIndex = s.lastIndexOf(" ");

        // Last word length
        int lastWordLength = s.length() - lastSpaceIndex - 1;

        System.out.println("Last word length: " + lastWordLength);




    }
}
