package Conditional_Problems;

import java.util.Scanner;

public class Area_of_Circle {

    static int Area(int r){
        int ans = 0;

        ans = (int) Math.PI * r * r;

        return  ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        int radius = in.nextInt();
        System.out.println(Area(radius));
    }
}
