import java.util.Arrays;

public class KthLargest {
    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;

        Arrays.sort(arr);

        int answer = arr[arr.length - k];

        System.out.println("Kth largest element = " + answer);
    }
}