
import java.util.Arrays;
import java.util.Scanner;

public class FindMinElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Arrays: " + Arrays.toString(arr));

        FindMinElemet(arr);
    }

    static void FindMinElemet(int[] arr) {

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum: " + min);
    }
}
