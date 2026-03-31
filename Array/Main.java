package Array;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		// Call methods
		ArrayOperation.input(arr);
		ArrayOperation.output(arr);

		int total = ArrayOperation.sum(arr);
		int maximum = ArrayOperation.max(arr);
		int minimum = ArrayOperation.min(arr);

		// Print results
		System.out.println("Sum = " + total);
		System.out.println("Max = " + maximum);
		System.out.println("Min = " + minimum);

		ArrayOperation.reverse(arr);
		ArrayOperation.output(arr);

		ArrayOperation.SecondLargest(arr);   

	}
}