//1929 Concantenation of Array - 

import java.util.Arrays;

public class ConcatenationOfArray {

    public int[] getConcatenation(int[] arr) {

        int n = arr.length;

        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {

            ans[i] = arr[i];
            ans[i + n] = arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        ConcatenationOfArray a = new ConcatenationOfArray();

        int[] ans = a.getConcatenation(arr);

        System.out.println(Arrays.toString(ans));
    }
}
