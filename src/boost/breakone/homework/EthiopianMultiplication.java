package boost.breakone.homework;

import java.util.Scanner;

public class EthiopianMultiplication {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter two numbers for multiplication");
		int userInputOne = scan.nextInt();
		int userInputTwo = scan.nextInt();
		scan.close();

		System.out.println("The result of the multiplication is: " + multiplicator(userInputOne, userInputTwo));

	}

	public static int multiplicator(int numOne, int numTwo) {
		int i = 0;
		boolean cont = true;
		int[] numtoUse = new int[9999];
		int result = 0;

		while (cont) {

			if (numOne % 2 != 0) {

				numtoUse[i] = numTwo;

				numTwo = numTwo * 2;
				numOne = numOne / 2;
				i++;
			} else {
				numOne = numOne / 2;
				numTwo = numTwo * 2;
				i++;

			}
			if (numOne == 3) {
				numtoUse[i] = numTwo;
				i++;
			}
			if (numOne / 2 == 1) {

				numTwo = numTwo * 2;
				numOne = numOne / 2;
				numtoUse[i] = numTwo;
				i++;
				cont = false;
			}
		}

		for (i = 0; i <= numtoUse.length - 1; i++) {
			result = result + numtoUse[i];

		}
		return result;

	}

}