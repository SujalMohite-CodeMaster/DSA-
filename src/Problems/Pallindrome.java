package Problems;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = in.next();

        String newstr = "";

        for(int i = str.length()-1; i >= 0; i--) {
            newstr = newstr + str.charAt(i);
        }

        if(str.equalsIgnoreCase(newstr)){

            System.out.println("Given string is pallindrome.");

        }else {
            System.out.println("Given string is not a pallindrome.");
        }
    }
}
