
// Write the program to print whether a number is even or odd, also take input from user.

// Taking input from user
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to check whether is even or odd: ");
        int number = in.nextInt();

        if((number%2) == 0){

            System.out.println("The given number is "+number+" even number.");
        }else {
            System.out.println("The given number is "+number+" odd number.");
        }

    }
}