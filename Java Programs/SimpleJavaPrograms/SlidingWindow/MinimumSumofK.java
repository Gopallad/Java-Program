
public class MinimumSumofK {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 3, 6};

        int k = 3;

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        int minSum = sum;

        for (int i = k; i < arr.length; i++) {

            sum = sum + arr[i] - arr[i - k];

            if (sum < minSum) {
                minSum = sum;
            }
        }
        System.out.println("MinSum: " + minSum);
    }
}
