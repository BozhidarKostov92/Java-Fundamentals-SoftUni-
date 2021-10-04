package vowelsCount;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String argsp[]) {

		Scanner keyboard = new Scanner(System.in);

		String input = keyboard.nextLine();
		String result = countOfVowels(input);
		System.out.print(result);

		keyboard.close();

	}

	private static String countOfVowels(String input) {

		int count = 0;
		String countString = "";
		for (char i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);
			char chLower = Character.toLowerCase(ch);

			if (chLower == 'a' || chLower == 'e' || chLower == 'i' || chLower == 'o' || chLower == 'u') {

				count++;
			}
		}
		countString = String.valueOf(count);
		return countString;
	}
}
