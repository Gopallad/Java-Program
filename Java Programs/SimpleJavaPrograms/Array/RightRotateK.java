
import java.util.Arrays;
import java.util.Scanner;

public class RightRotateK {

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

        System.out.println("Enter k: ");
        int k = sc.nextInt();

        for (int r = 1; r <= k; r++) {

            int temp = arr[arr.length - 1];

            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }
        System.out.println("Right Rotated Array: " + Arrays.toString(arr));

    }
}
