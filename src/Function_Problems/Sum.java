package Function_Problems;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

      /*  int add = addition(num1,num2);
        System.out.println(add);*/
        int product = multiply(num1,num2);
        System.out.println(product);

    }

    static int addition(int a, int b){
        return a+b;
    }

    static int multiply(int a ,int b){
        return a*b;
    }
}
