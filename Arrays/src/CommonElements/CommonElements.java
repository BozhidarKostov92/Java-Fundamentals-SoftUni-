package CommonElements;

import java.util.Scanner;

public class CommonElements {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		String[] data = keyboard.nextLine().split(" ");
		String[] array = new String[data.length];

		for (int i = 0; i < data.length; i++) {

			array[i] = data[i];

		}

		String[] data2 = keyboard.nextLine().split(" ");
		String[] array2 = new String[data2.length];

		for (int i = 0; i < data2.length; i++) {

			array2[i] = data2[i];

		}

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array2.length; j++)

			{
				if (array[i].equals(array2[j])) {

					System.out.print(array[i] + " ");

				}
			}
		}

		keyboard.close();
	}
}
