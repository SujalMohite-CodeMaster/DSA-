import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class StringToInt {
    public static void main(String[] args) {
        String  str = "123";

        int num = Integer.parseInt(str);
        System.out.println(num);
        num += 1;
        System.out.println(num);

        // System.out.println(Arrays.toString(num));

        String newstr = String.valueOf(num);



        int [] ans = new int[3];
        for (int i = 0; i < newstr.length(); i++) {
            ans[i] = newstr.charAt(i) - '0';
        }
        System.out.println(Arrays.toString(ans));

        int [] arr = {1,1,5,2,8,7,6,4};
        System.out.println(arr.length);
    }
}
