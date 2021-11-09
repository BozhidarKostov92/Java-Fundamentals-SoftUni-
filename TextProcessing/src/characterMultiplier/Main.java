package characterMultiplier;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		String[] data = scanner.nextLine().split(" ");

		String firstWord = data[0];
		String secondWord = data[1];
		String longWord;
		int index = 0;
		int sum = 0;
		if (firstWord.length() > secondWord.length()) {

			longWord = firstWord;
		} else {
			longWord = secondWord;
		}

		for (int i = 0; i < Math.min(firstWord.length(), secondWord.length()); i++) {

			int firstWordNum = firstWord.charAt(i);
			int secondWordNum = secondWord.charAt(i);

			sum += firstWordNum * secondWordNum;

			index++;
		}

		for (int i = index; i < longWord.length(); i++) {
			sum += longWord.charAt(i);
		}
		System.out.println(sum);
		scanner.close();
	}
}
