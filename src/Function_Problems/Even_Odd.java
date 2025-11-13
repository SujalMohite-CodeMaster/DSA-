package Function_Problems;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        if(isEvenOdd(number)){
            System.out.println("Given number is the Even number");
        }else{
            System.out.println("Odd number");
        }


    }

    static boolean isEvenOdd(int n){
        return n % 2 == 0;
    }
}

