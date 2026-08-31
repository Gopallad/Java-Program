import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    static void mergeSort(int[] arr, int start, int end) {

        if (start < end) {

            int mid = (start + end) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
    }

    static void merge(int[] arr, int start, int mid, int end) {

        int[] temp = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {

            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            arr[start + x] = temp[x];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Array:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before: " + Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After: " + Arrays.toString(arr));
    }
}