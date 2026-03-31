package Array;

import java.util.Scanner;

public class ArrayOperation {

	// Input
	public static void input(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}

	// Output
	public static void output(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// Sum
	public static int sum(int[] arr) {
		int s = 0;
		for (int i = 0; i < arr.length; i++) {
			s = s + arr[i];
		}
		return s;
	}

	// Max
	public static int max(int[] arr) {
		int m = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > m) {
				m = arr[i];
			}
		}
		return m;
	}

	// Min
	public static int min(int[] arr) {
		int m = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < m) {
				m = arr[i];
			}
		}
		return m;
	}

	// Reverse
	public static void reverse(int[] arr) {
		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			i++;
			j--;
		}
	}
	//second largest
	public static void SecondLargest(int[] arr) {

		int first, second;

		if (arr[0] > arr[1]) {
			first = arr[0];
			second = arr[1];
		} else {
			first = arr[1];
			second = arr[0];
		}

		for (int i = 2; i < arr.length; i++) {

			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second && arr[i] != first) {
				second = arr[i];
			}
		}

		if (first == second) {
			System.out.println("No second largest");
		} else {
			System.out.println("Second Largest = " + second);
		}
	}
	
}