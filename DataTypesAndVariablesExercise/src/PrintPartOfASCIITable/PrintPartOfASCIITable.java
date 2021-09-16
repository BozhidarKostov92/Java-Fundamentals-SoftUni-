package PrintPartOfASCIITable;

import java.util.Scanner;

public class PrintPartOfASCIITable {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int startNumber = keyboard.nextInt();
		int endNumber = keyboard.nextInt();

		for (int i = startNumber; i <= endNumber; i++) {

			char ascii = (char) i;
			System.out.print(ascii + " ");

		}

		keyboard.close();
	}
}
