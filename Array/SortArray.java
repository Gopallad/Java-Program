package Array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int[] arr = {50, 20, 40, 10, 30};

        Arrays.sort(arr);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
