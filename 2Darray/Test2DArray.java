package demo;

import java.util.Scanner;

public class Test2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size ");
		int n = sc.nextInt();

		int[][] arr = new int[n][n];

		Array2D.input(arr);
		Array2D.output(arr);

		int choice = 0;

		do {
			System.out.println("\n1. find max");
			System.out.println("2. find min");
			System.out.println("3. find sum");
			System.out.println("4. find sum rowwise");
			System.out.println("5. find sum columnwise");
			System.out.println("6. display");
			System.out.println("7. find rowwise maximum");
			System.out.println("8. find columnwise maximum");
			System.out.println("9. exit");
			System.out.print("Enter choice: ");

			choice = sc.nextInt();

			switch (choice) {

			case 1 -> {
				int max = Array2D.max(arr);
				System.out.println("Maximum: " + max);
			}

			case 2 -> {
				int min = Array2D.min(arr);
				System.out.println("Minimum: " + min);
			}

			case 3 -> {
				int sum = Array2D.sum(arr);
				System.out.println("Sum: " + sum);
			}

			case 4 -> {
				int[] sumarr = Array2D.sumofrows(arr);
				for (int i = 0; i < sumarr.length; i++) {
					System.out.println("Sum of row " + i + " -> " + sumarr[i]);
				}
			}

			case 5 -> {
				int[] sumarr = Array2D.sumofcol(arr);
				for (int i = 0; i < sumarr.length; i++) {
					System.out.println("Sum of column " + i + " -> " + sumarr[i]);
				}
			}

			case 6 -> {
				Array2D.output(arr);
			}

			case 7 -> {
				int[] maxRow = Array2D.maxRowwise(arr);
				for (int i = 0; i < maxRow.length; i++) {
					System.out.println("Max of row " + i + " -> " + maxRow[i]);
				}
			}

			case 8 -> {
				int[] maxCol = Array2D.maxColumnwise(arr);
				for (int i = 0; i < maxCol.length; i++) {
					System.out.println("Max of column " + i + " -> " + maxCol[i]);
				}
			}

			case 9 -> {
				System.out.println("Thank you...");
			}

			default -> {
				System.out.println("Wrong choice!");
			}
			}

		} while (choice != 9);

		sc.close();
	}
}