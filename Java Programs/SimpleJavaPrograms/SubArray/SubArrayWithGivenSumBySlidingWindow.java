
public class SubArrayWithGivenSumBySlidingWindow {

    public static void subArray(int[] arr, int target) {

        int i = 0;
        int sum = 0;

        for (int j = 0; j < arr.length; j++) {

            sum += arr[j];

            while (sum > target) {

                sum = sum - arr[i];
                i++;
            }
            if (sum == target) {
                System.out.print("Subarray: ");

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                return;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        int target = 5;
        subArray(arr, target);

    }
}
