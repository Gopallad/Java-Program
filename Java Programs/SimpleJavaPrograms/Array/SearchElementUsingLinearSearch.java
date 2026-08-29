
import java.util.Arrays;
import java.util.Scanner;

public class SearchElementUsingLinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println(Arrays.toString(arr));

        System.out.println("Enter element to search: ");
        int search = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == search) {
                System.out.println("Element is Found ");
                return;
            }
        }
        System.out.println("Element Not Found");

    }
}
