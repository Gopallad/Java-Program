
import java.util.Arrays;
import java.util.Scanner;

public class FindSecondSmallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array: ");
        int n = sc.nextInt();

        System.out.println("Enter Array: ");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest: " + smallest);

        int SecondSmallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smallest && arr[i] < SecondSmallest) {
                SecondSmallest = arr[i];
            }
        }
        System.out.println("SecondSmallest: " + SecondSmallest);

    }
}
