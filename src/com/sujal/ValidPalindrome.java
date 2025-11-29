package com.sujal;

class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]" , "").toLowerCase();
        StringBuilder sb = new StringBuilder(str);
        String strrev = sb.reverse().toString();
        if(str.equals(strrev)){
            return true;
        }
        return false;
    }
}