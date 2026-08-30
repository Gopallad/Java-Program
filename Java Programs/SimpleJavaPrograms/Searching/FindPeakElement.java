
import java.util.Arrays;
import java.util.Scanner;

public class FindPeakElement {

    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start > end) {
            int mid = (start + end) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();

        System.out.println("Enter Array: ");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int result = findPeak(arr);

        System.out.println("Peak Element: " + arr[result]);
        System.out.println("Peak Index: " + result);
    }
}
