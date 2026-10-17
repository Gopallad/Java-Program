//leetcode 643 Maximum Average Subarray

public class MaximumAverageSubarray {

    public static double findMaxAverage(int[] arr, int k) {

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }

        int maxSum = sum;

        for (int i = k; i < arr.length; i++) {

            sum = sum - arr[i - k] + arr[i];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return (double) maxSum / k;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8};
        int k = 2;

        double result = findMaxAverage(arr, k);
        System.out.println(result);
    }
}
