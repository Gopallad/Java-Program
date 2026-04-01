package Array;

import java.util.Scanner;

public class ToDarray {

	public static void input(int[][] arr) {  //input
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter elements:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
	}

	public static void output(int[][] arr) {//output
		System.out.println("Array elements:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int sum(int[][] arr) { //sum
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}

	public static int max(int[][] arr) { //max

		int max = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}

			}

		}
		return max;
	}

	public static int min(int[][] arr) { //min
		int min = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
			}
		}
		return min;
	}

	public static void sumofrows(int[][] arr) { //sumofrows

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;

			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}

			System.out.println("Sum of row " + i + " = " + sum);
		}
	}

	public static void sumofcol(int[][] arr) { //sumofcol

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;

			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[j][i];
			}

			System.out.println("Sum of col " + i + " = " + sum);
		}
	}

	public static void FindElement(int[][] arr) { //find element
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the a:");
		int a = sc.nextInt();

		System.out.println("Enter the b:");
		int b = sc.nextInt();

		System.out.println(arr[a][b]);

		if (a >= 0 && a < arr.length && b >= 0 && b < arr[a].length) {
			System.out.println("Element " + arr[a][b]);
		} else {
			System.out.println("invalid index");
		}
	}

	public static void fullReverse(int[][] arr) { //reverse 

	    int start = 0;
	    int end = arr.length - 1;

	    while (start < end) {
	        int[] temp = arr[start];
	        arr[start] = arr[end];
	        arr[end] = temp;

	        start++;
	        end--;
	    }


	    for (int i = 0; i < arr.length; i++) {

	        int left = 0;
	        int right = arr[i].length - 1;

	        while (left < right) {
	            int temp = arr[i][left];
	            arr[i][left] = arr[i][right];
	            arr[i][right] = temp;

	            left++;
	            right--;
	        }
	    }

	    System.out.println("Fully Reversed Matrix:");
	    output(arr);
	}
}
