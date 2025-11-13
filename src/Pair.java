import java.util.Arrays;
import java.util.Scanner;

public class Pair {
    public static void main(String[] args) {
     //   int [] arr = {2,4,6,8,10};

        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("enter the ele in array");
        for (int i = 0; i < arr.length; i++) {
           arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1 ; j < arr.length; j++) {

                System.out.println("("+arr[i] + ","+ arr[j]+")");
            }
            
        }
    }
}
