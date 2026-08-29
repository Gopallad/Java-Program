
import java.util.Arrays;
import java.util.Scanner;

public class FindSecondLargestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();

        System.out.println("Enter Array: ");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int Largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Largest) {
                Largest = arr[i];
            }
        }
        System.out.println("Largest: " + Largest);
        int SecondLargest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < Largest && arr[i] > SecondLargest) {
                SecondLargest = arr[i];
            }
        }
        System.out.println("Second Lagest: " + SecondLargest);
    }
}
