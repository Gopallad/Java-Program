
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array: ");

        int n = sc.nextInt();

        System.out.println("Enter Array: ");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter element to Search: ");
        int search = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Element is found at index: " + i);
                return;
            }
        }
        System.out.println("Element is not Found");
    }
}
