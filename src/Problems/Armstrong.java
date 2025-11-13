package Problems;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int num1 = in.nextInt(), num2 = in.nextInt();

        if (isArmstrong(num1)) {
            System.out.println(num1 + " is an Armstrong number.");
        } else {
            System.out.println(num1 + " is not an Armstrong number.");
        }

        if (isArmstrong(num2)) {
            System.out.println(num2 + " is an Armstrong number.");
        } else {
            System.out.println(num2 + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int number) {
        int original = number;
        int count = String.valueOf(number).length();
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, count);
            number /= 10;
        }

        return sum == original;
    }
}
