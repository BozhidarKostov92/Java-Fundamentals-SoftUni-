package MaxSequenceOfEqualElements;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int[] inputArr = Arrays.stream(keyboard.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		int count = 1;
		int max = 0;
		int element = inputArr[0];

		for (int i = 1; i < inputArr.length; i++) {

			if (inputArr[i] == inputArr[i - 1]) {
				count++;

				if (count > max) {

					max = count;
					element = inputArr[i];

				}
			} else
				count = 1;

		}

		for (int i = 0; i < max; i++) {
			
			System.out.print(element + " ");
		}
		keyboard.close();

	}
}
