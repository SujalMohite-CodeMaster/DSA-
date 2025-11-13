package Conditional_Problems;

import java.util.Scanner;

public class Factorial {
    static int fact(int n){

        if(n == 0 || n == 1){
            return 1;
        }
       int ans = 1;
        while (n>0){
            ans *= n;
            n--;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(fact(n));

    }
}

