package boost.breakone.homework;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word;
		System.out.println("Please enter a word to check: ");
		word = scan.nextLine();
		int n = 0;
		Character[] wordReverse = new Character[word.length()];
		Character[] wordNormal = new Character[word.length()];
		Boolean[] checkerArray = new Boolean[word.length()];

		for (int i = word.length() - 1; i >= 0; i--) {
			wordReverse[n] = word.charAt(i);
			n++;

		}
		for (int i = 0; i <= word.length() - 1; i++) {
			wordNormal[i] = word.charAt(i);

		}

		n = 0;
		do {
			checkerArray[n] = wordNormal[n].equals(wordReverse[n]);
			n++;

		} while (n <= word.length() - 1);

		n = 0;
		int a = 0;
		do {

			if (checkerArray[n] == true) {

			} else {

				a++;
			}
			n++;
		} while (n <= word.length() - 1);

		if (a == 0) {
			System.out.println("Your word is a palindrom! ");
		} else {
			System.out.println("Your word is not a palindrom. ");
		}

	}

}
