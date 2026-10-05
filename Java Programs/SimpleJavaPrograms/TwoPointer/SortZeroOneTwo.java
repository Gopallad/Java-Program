
import java.util.Arrays;

public class SortZeroOneTwo {

    public static void sort(int[] arr) {

        int i = 0;
        int j = 0;

        int k = arr.length - 1;

        while (j <= k) {

            if (arr[j] == 0) {

                int temp = arr[i];

                arr[i] = arr[j];

                arr[j] = temp;

                i++;
                j++;
            } else if (arr[j] == 1) {
                j++;
            } else {

                int temp = arr[j];
                arr[j] = arr[k];

                arr[k] = temp;

                k--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 1, 2, 0, 0, 2, 1};

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
