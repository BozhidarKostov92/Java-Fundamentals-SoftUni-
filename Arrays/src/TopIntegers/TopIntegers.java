package TopIntegers;

import java.util.Scanner;

public class TopIntegers {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		String[] nums = keyboard.nextLine().split(" ");

		for (int i = 0; i < nums.length; i++) {

			Boolean isItBigger = true;

			for (int j = i + 1; j < nums.length; j++) {

				if (Integer.parseInt(nums[i]) <= Integer.parseInt(nums[j])) {

					isItBigger = false;

				}
			}

			if (isItBigger) {

				System.out.print(nums[i] + " ");

			}

		}

		keyboard.close();

	}
}
