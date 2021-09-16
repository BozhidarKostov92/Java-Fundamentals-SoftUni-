package IntegerOperations;

import java.util.Scanner;

public class IntegerOperations {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int sumNumber1, sumNumber2, devideNumber3, multiplyNumber4, result;

		sumNumber1 = keyboard.nextInt();
		sumNumber2 = keyboard.nextInt();
		devideNumber3 = keyboard.nextInt();
		multiplyNumber4 = keyboard.nextInt();

		result = ((sumNumber1 + sumNumber2) / devideNumber3) * multiplyNumber4;

		System.out.println(result);

		keyboard.close();

	}
}
