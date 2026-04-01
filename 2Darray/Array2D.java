package demo;

import java.util.Scanner;

public class Array2D {

	public static void input(int[][] arr) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter elements:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
	}

	public static void output(int[][] arr) {
		System.out.println("Array elements:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int sum(int[][] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}

	public static int max(int[][] arr) {
		int max = arr[0][0];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}

	public static int min(int[][] arr) {
		int min = arr[0][0];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
			}
		}
		return min;
	}

	public static int[] sumofrows(int[][] arr) {
		int[] result = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			result[i] = sum;
		}
		return result;
	}

	public static int[] sumofcol(int[][] arr) {
		int[] result = new int[arr[0].length];

		for (int i = 0; i < arr[0].length; i++) {
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				sum += arr[j][i];
			}
			result[i] = sum;
		}
		return result;
	}

	public static int[] maxRowwise(int[][] arr) {
		int[] result = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int max = arr[i][0];
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
			result[i] = max;
		}
		return result;
	}

	public static int[] maxColumnwise(int[][] arr) {
		int[] result = new int[arr[0].length];

		for (int i = 0; i < arr[0].length; i++) {
			int max = arr[0][i];
			for (int j = 0; j < arr.length; j++) {
				if (arr[j][i] > max) {
					max = arr[j][i];
				}
			}
			result[i] = max;
		}
		return result;
	}

	public static void fullReverse(int[][] arr) {

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