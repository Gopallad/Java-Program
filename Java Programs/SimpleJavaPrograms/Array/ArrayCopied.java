
import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopied {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Orginal Array: " + Arrays.toString(arr));

        int[] copy = new int[n];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        System.out.println("Copied Array: " + Arrays.toString(arr));
    }
}
