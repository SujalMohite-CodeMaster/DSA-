package Conditional_Problems;

import java.util.Scanner;

public class Area_of_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the base and height of triangle.");
        double base = in.nextDouble();
        double height = in.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("Area of triangle is :"+area);


    }
}
