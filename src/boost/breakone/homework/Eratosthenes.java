package boost.breakone.homework;

import java.util.Scanner;

public class Eratosthenes {

	public static void main(String[] args) {

		System.out.println("What is the upper limit for prime number search");
		Scanner scanner = new Scanner(System.in);
		int l = scanner.nextInt();
		scanner.close();
		int[] numberList = new int[l];
		numberList = allNumbers(l, numberList);
		numberList = sieve(l, numberList);
		display(numberList, l);
	}

	public static int[] allNumbers(int n, int[] numbers) {
		for (int i = 0; i <= n - 1; i++) {
			numbers[i] = i + 1;
		}
		return numbers;
	}

	public static int[] sieve(int n, int[] numbersArray) {
		for (int i = 2; i <= n; i++) {
			for (int j = i + i; j <= n; j = j + i) {
				for (int k = 0; k <= n - 1; k++) {
					if (numbersArray[k] % j == 0) {
						numbersArray[k] = 0;
					}
				}

			}
		}
		return numbersArray;
	}

	public static void display(int[] numberList, int n) {

		int a = 0;
		for (int i = 0; i <= n - 1; i++) {
			if (numberList[i] != 0) {

				if (a % 5 == 0) {

					System.out.println(" ");
				}

				System.out.print(numberList[i] + " ");
				a++;
			}
		}
	}
}