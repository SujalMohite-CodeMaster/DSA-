package Function_Problems;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number ");
        int num  = in.nextInt();

        if(isPrime(num)){
            System.out.println("Number is Prime number");
        }else {
            System.out.println("number is not a Prime number");
        }



    }

    static boolean isPrime(int num){
        for (int i = 2; i < num; i++){
            if (num%i == 0 ){
                return false;
            }
        }
        return true;
    }
}