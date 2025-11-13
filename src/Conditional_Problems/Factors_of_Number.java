package Conditional_Problems;

import java.util.*;
public class Factors_of_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = in.nextInt();

        int i = 1;
        while(i<=number){
            if (number%i == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
