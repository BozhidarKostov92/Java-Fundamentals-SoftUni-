package factorialDivision;

import java.util.Scanner;

public class FactorialDivision {


	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		long num1, num2;

		num1 = keyboard.nextInt();
		num2 = keyboard.nextInt();

		double result = factorial(num1) / factorial(num2);

		System.out.printf("%.2f", result);
		keyboard.close();
	}

	private static double factorial(long n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));

	}
}
