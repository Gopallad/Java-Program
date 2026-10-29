
import java.util.Arrays;
import java.util.Scanner;

public class CountOddElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(arr));
        System.out.println("Count Odd Element: ");

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println("Odd Element: " + arr[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}
