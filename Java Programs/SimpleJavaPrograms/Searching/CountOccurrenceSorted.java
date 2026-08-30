
import java.util.Arrays;
import java.util.Scanner;

public class CountOccurrenceSorted {

    static int firstOccurrence(int[] arr, int search) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == search) {
                result = mid;
                end = mid - 1;
            } else if (search < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int lastOccurrence(int[] arr, int search) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == search) {
                result = mid;
                start = mid + 1;
            } else if (search <= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter Array: ");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter element to search: ");
        int search = sc.nextInt();

        int first = firstOccurrence(arr, search);

        int Last = lastOccurrence(arr, search);

        if (first == -1) {
            System.out.println("Element Not Found");
        } else {
            int count = Last - first + 1;
            System.out.println("Count: " + count);
        }
    }
}
