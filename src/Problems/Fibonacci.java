package Problems;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the nth number of fibonacci series: ");
        int n = in.nextInt();

        int num1 = 0 , num2 = 1;



        System.out.print(num1+","+num2+",");

        for (int i = 0; i < n-2; i++) {

            int result = num1 + num2 ;
            System.out.print(result+",");
            num1 = num2;
            num2 = result;

        }

    }
}
