
import java.util.Arrays;
import java.util.Scanner;

public class FirstOccurrenceBS {

    static int firstOccurrence(int[] arr, int search) {

        int start = 0;
        int end = arr.length - 1;

        int result = -1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == search) {

                result = mid;
                end = mid - 1;

            } else if (search > arr[mid]) {

                start = mid + 1;

            } else {

                end = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array:");
        int n = sc.nextInt();

        System.out.println("Enter Sorted Array:");

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(arr));

        System.out.println("Enter Element to Search:");
        int search = sc.nextInt();

        int result = firstOccurrence(arr, search);

        System.out.println("First Occurrence Index: " + result);
    }
}
