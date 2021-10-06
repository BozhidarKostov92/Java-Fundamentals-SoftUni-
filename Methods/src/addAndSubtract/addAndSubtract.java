package addAndSubtract;

import java.util.Scanner;

public class addAndSubtract {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int num1 = keyboard.nextInt();
		int num2 = keyboard.nextInt();
		int num3 = keyboard.nextInt();

		int result = subtractThirdNum(num1, num2, num3);
		System.out.println(result);

		keyboard.close();
	}

	private static int sumTwoNumber(int num1, int num2) {
		return num1 + num2;
	}

	private static int subtractThirdNum(int num1, int num2, int num3) {

		return sumTwoNumber(num1, num2) - num3;
	}

}
