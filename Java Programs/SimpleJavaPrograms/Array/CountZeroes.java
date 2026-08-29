
import java.util.Arrays;
import java.util.Scanner;

public class CountZeroes {

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

        int countZeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZeros++;
            }
        }
        System.out.println("CountZeros: " + countZeros);
    }
}
