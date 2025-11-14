package com.sujal;

//https://leetcode.com/problems/longest-palindromic-substring/description/
public class LongestPallandromicSubstring {
   static String longestSubstring(String s) {

       if (s == null || s.length() < 1) return "";

       int start = 0 , end = 0;

       for (int i = 0; i < s.length(); i++) {
           int len1 = expandFromCenter(s, i, i); // odd length
           int len2 = expandFromCenter(s, i, i+1); //even length

           int len = Math.max(len1, len2);

           if (len > end - start) {
               start = i - (len - 1) / 2;
               end = i + len / 2;
           }
       }

       return s.substring(start,end + 1);
    }

    static int expandFromCenter(String s , int left , int right) {
       while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
           left --;
           right++ ;
       }
       return right - left - 1; // length of the pallindrome
    }


    public static void main(String[] args) {
        String s = "madasms";
        StringBuilder sb = new StringBuilder(s);
        String rev = String.valueOf(sb.reverse());

        System.out.println(longestSubstring(s));

       /* if(s.equals(rev)){
            System.out.println("pallandromic");
        }else {
            System.out.println("Not pallandromic");
        }*/
    }
}
