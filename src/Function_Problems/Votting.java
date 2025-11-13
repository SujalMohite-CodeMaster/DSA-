package Function_Problems;
import java.util.*;
public class Votting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter you age");
        int age = in.nextInt();
        Eligible(age);

    }
    static void Eligible(int n){
        if (n < 18) System.out.println("Not eligible");
        else {
            System.out.println("Eligible to vote");
        }
    }
}
