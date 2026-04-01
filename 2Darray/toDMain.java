package Array;

import java.util.Scanner;

public class toDMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size ");
		int n = sc.nextInt();

		int[][] arr = new int[n][n];

		ToDarray.input(arr);
		ToDarray.output(arr);

		int total = ToDarray.sum(arr);

		System.out.println("Sum of all elements = " + total);

		int max = ToDarray.max(arr);
		System.out.println("Max is: " + max);

		int min = ToDarray.min(arr);
		System.out.println("min is: " + min);

		ToDarray.sumofrows(arr);
		
		ToDarray.sumofcol(arr);
		
		
		ToDarray.FindElement(arr);
		
		ToDarray.fullReverse(arr);

	}
}
