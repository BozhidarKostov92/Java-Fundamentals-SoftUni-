package PrinAandSum;

import java.util.Scanner;

public class PrinAandSum {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int startNumber, endNumber, sum;

		startNumber = keyboard.nextInt();
		endNumber = keyboard.nextInt();

		sum = 0;

		for (int i = startNumber; i <= endNumber; i++) {

			sum += i;
			System.out.print(i + " ");

		}
		System.out.println();
		System.out.println("Sum: " + sum);

		keyboard.close();

	}

}
