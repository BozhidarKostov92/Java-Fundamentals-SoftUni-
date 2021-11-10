package extractFile;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		System.out.println("File name: " + input.substring(input.lastIndexOf("\\") + 1, input.indexOf(".")));
		System.out.println("File extension: " + input.substring(input.indexOf(".") + 1));
		scanner.close();

	}
}
