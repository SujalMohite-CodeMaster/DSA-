package Problems;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rupess = in.nextInt();

        double USD = rupess/85.47;

        System.out.println("Rupees " + rupess + " to USD :"+USD);
    }
}
