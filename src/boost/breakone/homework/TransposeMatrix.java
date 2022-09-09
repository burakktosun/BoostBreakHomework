package boost.breakone.homework;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {

		System.out.println("Please enter row and column");
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		int column = scanner.nextInt();

		int[][] matrix = new int[row][column];
		int[][] transpose = new int[column][row];

		for (int j = 0; j <= column - 1; j++) {

			for (int i = 0; i <= row - 1; i++) {
				System.out.println("Please enter matrix " + (i + 1) + " th row " + (j + 1) + " th column");
				matrix[i][j] = scanner.nextInt();

			}

		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		for (int j = 0; j <= column - 1; j++) {

			for (int i = 0; i <= row - 1; i++) {
				transpose[j][i] = matrix[i][j];

			}

		}

		for (int j = 0; j < transpose.length; j++) {
			for (int i = 0; i < transpose[i].length; i++) {
				System.out.print(transpose[j][i] + " ");
			}
			System.out.println();

		}
	}
}
