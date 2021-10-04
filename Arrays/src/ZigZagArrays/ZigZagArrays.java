package ZigZagArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int countOfLines = Integer.parseInt(keyboard.nextLine());

		int[] array1 = new int[countOfLines];
		int[] array2 = new int[countOfLines];

		for (int i = 0; i < countOfLines; i++) {

			String[] data = keyboard.nextLine().split(" ");

			if (i % 2 == 0) {

				array1[i] = Integer.parseInt(data[0]);
				array2[i] = Integer.parseInt(data[1]);

			}

			else {
				array1[i] = Integer.parseInt(data[1]);
				array2[i] = Integer.parseInt(data[0]);
			}

		}
		Arrays.stream(array1).forEach(n -> System.out.print(n+ " "));	
		System.out.println();
		Arrays.stream(array2).forEach(n -> System.out.print(n+ " "));
	
		keyboard.close();

	}
}
