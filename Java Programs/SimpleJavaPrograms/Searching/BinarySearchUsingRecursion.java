
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchUsingRecursion {

    static int binarySearch(int[] arr, int search, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;

        if (arr[mid] == search) {
            return mid;
        }
        if (search > arr[mid]) {
            return binarySearch(arr, search, mid + 1, end);
        } else {
            return binarySearch(arr, search, start, mid - 1);
        }
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

        System.out.println("Enter Element to Search: ");
        int search = sc.nextInt();

        int result = binarySearch(arr, search, 0, arr.length - 1);

        System.out.println(result);

    }
}
