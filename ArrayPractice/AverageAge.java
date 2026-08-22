
import java.util.Arrays;
import java.util.Scanner;

public class AverageAge {

    public static double average(int[] age) {
        int sum = 0;

        for (int i = 0; i < age.length; i++) {
            sum = sum + age[i];
        }
        return (double) sum / age.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Arrays: " + Arrays.toString(arr));

    }
}
