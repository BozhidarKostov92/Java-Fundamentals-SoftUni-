package MagicSum;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int[] inputArr = Arrays.stream(keyboard.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int number = keyboard.nextInt();

		int magicSum = 0;

		for (int i = 0; i < inputArr.length; i++) {

			for (int j = i + 1; j < inputArr.length; j++) {

				magicSum = inputArr[i] + inputArr[j];

				if (magicSum == number) {

					System.out.print(inputArr[i] + " ");
					System.out.print(inputArr[j] + " ");
					System.out.println();
				}
			}
		}

		keyboard.close();

	}
}
