package Conditional_Problems;

import java.util.Scanner;

public class Product_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Price of the Product.");
        int price = sc.nextInt();

        System.out.println("Enter the rate of the discount");
        int rate = sc.nextInt();

        float discount_price = price -(price * (rate/100.0f));
        System.out.println("The price after discount  is "+discount_price);
    }
}
