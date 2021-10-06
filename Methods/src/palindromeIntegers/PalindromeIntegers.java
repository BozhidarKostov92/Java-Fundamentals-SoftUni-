package palindromeIntegers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeIntegers {

	public static void main(String args[]) throws IOException {

		String num = null;

		printPalindromeIntegers(num);

	}

	private static void printPalindromeIntegers(String num) throws IOException {

		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

		while (!"END".equals(num = read.readLine())) {

			StringBuffer reverseNum = new StringBuffer(num);
			reverseNum.reverse();

			if (reverseNum.toString().equals(num)) {

				System.out.println("true");
			} else {
				System.out.println("false");
			}

		}
	}
}
