
import java.util.Arrays;
import java.util.Scanner;

public class FindMaxElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size Of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Arraay: " + Arrays.toString(arr));

        findMaximum(arr);

    }

    static void findMaximum(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print("Maximum: " + max);
    }
}
