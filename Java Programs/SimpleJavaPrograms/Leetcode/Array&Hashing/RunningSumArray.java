// 1480 Running Sum 1d Array  -- prefix sum 

import java.util.Arrays;

public class RunningSumArray {

    public int[] runningSum(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        RunningSumArray b = new RunningSumArray();

        int[] ans = b.runningSum(arr);

        System.out.println(Arrays.toString(ans));
    }
}
