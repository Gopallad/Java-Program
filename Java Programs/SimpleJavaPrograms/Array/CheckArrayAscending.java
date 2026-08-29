
import java.util.Arrays;
import java.util.Scanner;

public class CheckArrayAscending {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter Array: ");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        boolean order = true;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                order = false;
                break;
            }
        }
        if (order) {
            System.out.println("Ascending Order");
        } else {
            System.out.println("Descending Order");
        }
    }
}
