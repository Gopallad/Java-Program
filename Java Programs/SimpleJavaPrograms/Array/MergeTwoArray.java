
import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of First Array: ");

        int n = sc.nextInt();

        System.out.println("Enter First Array: ");
        int[] arr1 = new int[n];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter Size of Second Array: ");
        int m = sc.nextInt();

        System.out.println("Enter Second Array: ");
        int[] arr2 = new int[m];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("First Array: " + Arrays.toString(arr1));
        System.out.println("Second Array: " + Arrays.toString(arr2));

        int[] merge = new int[n + m];

        for (int i = 0; i < arr1.length; i++) {
            merge[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            merge[n + i] = arr2[i];
        }

        System.out.println(Arrays.toString(merge));
    }
}
