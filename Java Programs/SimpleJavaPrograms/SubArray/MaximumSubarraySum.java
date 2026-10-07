
public class MaximumSubarraySum {

    public static int maxSubarraySum(int[] arr) {

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = i; j < arr.length; j++) {

                sum += arr[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
                System.out.println();
            }

        }
        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        System.out.println(maxSubarraySum(arr));
    }
}
