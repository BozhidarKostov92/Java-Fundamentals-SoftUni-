package ArrayRotation;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayRotation {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		String word = keyboard.nextLine();
		int numOfRotations = keyboard.nextInt();

		String[] nums = word.split(" ");

		for (int j = 0; j < numOfRotations; j++) {
			var temp = nums[0];
			for (var i = 0; i < nums.length - 1; i++) {
				nums[i] = nums[i + 1];
			}
			nums[nums.length - 1] = temp;
		}

		Arrays.stream(nums).forEach(s -> System.out.print(s + " "));

		keyboard.close();

	}
}
