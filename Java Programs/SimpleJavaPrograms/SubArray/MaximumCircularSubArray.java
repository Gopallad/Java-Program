
public class MaximumCircularSubArray {

    public static int maxCircularSum(int[] arr) {

        int totalSum = 0;

        int currentMax = 0;
        int maxSum = Integer.MIN_VALUE;

        int currentMin = 0;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            totalSum = totalSum + arr[i];

            if (currentMax > maxSum) {
                maxSum = currentMax;
            }
            if (currentMax < 0) {
                currentMax = 0;
            }
            currentMin = currentMin + arr[i];

            if (currentMin < minSum) {
                minSum = currentMin;
            }
            if (currentMin > 0) {
                currentMin = 0;
            }
        }
        if (maxSum < 0) {
            return maxSum;
        }

        int circularSum = totalSum - minSum;

        if (maxSum > circularSum) {
            return maxSum;
        } else {
            return circularSum;
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, -3, 5};

        System.out.println(maxCircularSum(arr));

    }
}
