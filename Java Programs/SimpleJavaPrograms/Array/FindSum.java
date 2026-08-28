
import java.util.Scanner;

public class FindSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n =sc.nextInt();

        System.out.println("Enter Array: ");
        int[]arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
    }
}
