
import java.util.Scanner;

public class FindAverageOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array: ");
        int n =sc.nextInt();

        System.out.println("Enter Array: ");
        int[]arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int sum =0; 
        for(int i=0; i<arr.length; i++){
            sum = sum +arr[i];
        }
        int average = sum/n;
        System.out.println("Average: "+average);
    }
}
