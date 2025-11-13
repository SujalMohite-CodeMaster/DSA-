package Problems;
import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal");
        double principle = sc.nextDouble();
        System.out.println("Enter the number of years.");
        int time  = sc.nextInt();
        System.out.println("Enter the rate of interest.");
        float rate = sc.nextFloat();

        double result = (principle * time * rate) / 100 ;
        System.out.println("The Simple interest is :"+result);

    }
}
