package TriangleOfNumbers;

import java.util.Scanner;

public class TriangleOfNumbers {

	public static void main(String argsp[]) {

		Scanner keyboard = new Scanner(System.in);

		byte number = keyboard.nextByte();

		for (int row = 1; row <= number; row++) {

			for (int column = 1; column <= row; column++) {

				System.out.print(row + " ");

			}
			System.out.println();

		}

		keyboard.close();

	}
}
