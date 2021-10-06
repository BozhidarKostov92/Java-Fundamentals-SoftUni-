package nxNMatrix;

import java.util.Scanner;

public class NxNMatrix {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int number = keyboard.nextInt();

		printNxNMatix(number);

		keyboard.close();
	}

	private static void printNxNMatix(int number) {

		for (int i = 0; i < number; i++) {

			for (int j = 0; j < number; j++) {

				System.out.print(number + " ");
			}

			System.out.println();
		}

	}
}
