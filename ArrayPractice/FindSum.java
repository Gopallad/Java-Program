
import java.util.Arrays;
import java.util.Scanner;

public class FindSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Arrys: "+Arrays.toString(arr));

        FindSum(arr);
    }

    static void FindSum(int[]arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum +arr[i];
        }
        System.out.print("Sum: "+sum);
    }
}
