
import java.util.Arrays;
import java.util.Scanner;

public class MoveAllZeroes {

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

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {

                for (int j = i + 1; j < arr.length; j++) {

                    if (arr[j] != 0) {

                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;

                        break;
                    }
                }
            }
        }
        System.out.print("After Moving All Zeros: " + Arrays.toString(arr));
    }
}
