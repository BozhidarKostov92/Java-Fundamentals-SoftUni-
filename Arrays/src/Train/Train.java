package Train;

import java.util.Scanner;

public class Train {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int countOfVagoon = Integer.parseInt(keyboard.nextLine());

		int[] peopleInVagoon = new int[countOfVagoon];
		int sum = 0;

		for (int i = 0; i < countOfVagoon; i++) {

			peopleInVagoon[i] = Integer.parseInt(keyboard.nextLine());

			sum += peopleInVagoon[i];

		}
		for (int element : peopleInVagoon) {
			System.out.print(element + " ");
		}
		System.out.printf("%n%d", sum);

		keyboard.close();

	}

}
