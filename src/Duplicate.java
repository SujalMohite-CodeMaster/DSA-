public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,8,2,6,7,1};
        // print the duplicates element in the array.

        int i = 0;
        while (i < arr.length) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element");
                    System.out.println(arr[j]);
                }
            }
            i++;
        }
    }
}
