package Conditional_Problems;

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the commision amount");
        double commission = in.nextDouble();
        System.out.println("enter the total amount of sales");
        double sales = in.nextDouble();

        double commission_percentage = (commission/sales) * 100;
        System.out.println("Commission percentage is "+commission_percentage+"%");
    }
}
