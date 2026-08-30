
import java.util.Arrays;
import java.util.Scanner;

public class FindAlloccurrencesOfanElement {

    static void OccurrencesAll(int[] arr, int search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Found at index" + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array: ");
        int n = sc.nextInt();

        System.out.println("Enter array: ");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter element to search: ");
        int search = sc.nextInt();

        OccurrencesAll(arr, search);

    }
}
