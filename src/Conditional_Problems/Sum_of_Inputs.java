package Conditional_Problems;

import java.util.Scanner;

public class Sum_of_Inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        while (true){

            int input = in.nextInt();
            if(input != 0){
                sum += input;
            }else {
                break;
            }
        }

        System.out.println(sum);
    }
}
