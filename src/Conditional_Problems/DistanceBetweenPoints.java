package Conditional_Problems;

import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the co ordinates of 1st point");
        float x1 = in.nextFloat();
        float y1 = in.nextFloat();

        System.out.println("Enter the co orinates of 2nd point");
        float x2 = in.nextFloat();
        float y2 = in.nextFloat();

        float distance = (float) Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

        System.out.println("Distance is "+distance);
    }
}
