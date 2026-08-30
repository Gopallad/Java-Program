
import java.util.Arrays;
import java.util.Scanner;

public class LastOccurrenceBS {

    static int lastOccurrenceBS(int[] arr, int search) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == search) {
                result = mid;
                start = mid + 1;
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

        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();

        System.out.println("Enter Array: ");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter element to Search: ");
        int search = sc.nextInt();

        int result = lastOccurrenceBS(arr, search);
        System.out.println("Last Occurrence of Index: " + result);

    }
}
