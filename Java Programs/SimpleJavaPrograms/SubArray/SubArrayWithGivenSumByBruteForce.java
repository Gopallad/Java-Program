
public class SubArrayWithGivenSumByBruteForce {

    public static void subArray(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = i; j < arr.length; j++) {

                sum += arr[j];

                if (sum == target) {

                    System.out.print("Subarray: ");
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    return ;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        int target = 3;

        subArray(arr, target);
    }
}
