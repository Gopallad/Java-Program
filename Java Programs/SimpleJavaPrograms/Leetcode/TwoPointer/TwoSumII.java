
import java.util.Arrays;

public class TwoSumII {

    public static int[] twoSum(int[] a, int target) {

        int left = 0;
        int right = a.length - 1;

        while (left < right) {

            int sum = a[left] + a[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 9, 11};
        int target = 9;

        System.out.println(Arrays.toString(arr));

        int[] a = twoSum(arr, target);

        System.out.println(Arrays.toString(a));

    }
}
