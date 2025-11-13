package Conditional_Problems;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = in.next();
        String reverse_string = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reverse_string += str.charAt(i);
        }
        System.out.println(reverse_string);
    }
}

// more efficient way to reverse the string in java

/*class ReverseString {
    public static void main(String[] args) {
        String str = "Sujal";
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println(reverse);
    }

}*/


