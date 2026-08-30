
import java.util.Arrays;
import java.util.Scanner;

public class FindIntersectionTwoArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of First Array: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter Size of Second Array: ");
        int m = sc.nextInt();

        System.out.println("Print Array: ");
        int[] arr2 = new int[m];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.toString(arr2));

        System.out.println("Intersection Of Two Arrays: ");

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[i]) {
                    System.out.println(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}
