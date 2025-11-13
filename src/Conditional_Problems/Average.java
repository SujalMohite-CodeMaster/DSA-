package Conditional_Problems;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many numbers:");
        int n = in.nextInt();
        int count = 1;
        int sum = 0;

        System.out.println("Enter "+ n +" numbers");
        while (count <= n){
            int num = in.nextInt();
            sum += num;
            count++;
        }

        System.out.println("average is "+ (sum/count));
    }
}
