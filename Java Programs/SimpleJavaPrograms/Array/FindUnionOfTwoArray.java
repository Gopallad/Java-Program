
import java.util.Arrays;
import java.util.Scanner;

public class FindUnionOfTwoArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of First Array: ");
        int n = sc.nextInt();

        System.out.println("Enter Array: ");
        int[] arr1 = new int[n];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter Size of Second Array: ");
        int m = sc.nextInt();

        System.out.println("Enter Array: ");
        int[] arr2 = new int[m];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println("Union Element: ");

        //print first array
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " ");
        }

        for (int i = 0; i < arr2.length; i++) {

            boolean found = false;

            for (int j = 0; j < arr1.length; j++) {

                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(arr2[i] + " ");
            }
        }

    }
}
