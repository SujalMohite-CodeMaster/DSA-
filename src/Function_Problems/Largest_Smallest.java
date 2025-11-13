package Function_Problems;
import java.util.*;
public class Largest_Smallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int largest =  largest(num1,num2,num3);
        int smallest = smallest(num1,num2,num3);
        System.out.println("Largest number is: "+largest);
        System.out.println("Smallest number is: "+smallest);
    }

    static int largest(int a , int b , int c){
        if(a>b && a>c){
            return a;
        } else if (b>c && b>a) {
            return b;
        }else {
            return c;
        }
    }

    static int smallest(int a, int b , int c){
        int min = a;
        if(b < min){
            min = b;
        }
        if(c < min){
            min = c;
        }
        return min;
    }
}
