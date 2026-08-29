
import java.util.Arrays;
import java.util.Scanner;

public class CountNegativeElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size: ");
        int n = sc.nextInt();

        System.out.println("Enter Array: ");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int countOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println("OddElement: " + arr[i]);
                countOdd++;
            }
        }
        System.out.println(countOdd);

    }
}
