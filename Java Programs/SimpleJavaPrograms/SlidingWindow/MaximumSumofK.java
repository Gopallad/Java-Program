
public class MaximumSumofK {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 3, 6};

        int k = 3;

        int sum = 0;

        for (int i = 0; i < k; i++) {

            sum = sum + arr[i];
        }
        int maxSum = sum;
        for (int i = k; i < arr.length; i++) {

            sum = sum + arr[i] - arr[i - k];

            if (sum > maxSum) {
                maxSum = sum;
            }

        }
        System.out.println("MaxSum: " + maxSum);
    }
}
