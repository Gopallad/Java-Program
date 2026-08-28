
import java.util.Arrays;
import java.util.Scanner;

public class TakeArrayinput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array: ");
        int n = sc.nextInt();

        System.out.println("Enter a Array: ");
        int[] arr = new int[n];

        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i <= arr.length - 1; i++) {    //simple print
            System.out.print(arr[i] + " ");
        }
        
        System.out.println(Arrays.toString(arr));     //print with bracket 
    }
}
