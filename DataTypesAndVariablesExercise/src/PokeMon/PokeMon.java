package PokeMon;

import java.util.Scanner;

public class PokeMon {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int pokePower, distance, exhaustionFactor;

		pokePower = keyboard.nextInt();
		distance = keyboard.nextInt();
		exhaustionFactor = keyboard.nextInt();

		int targets, startPokePower;
		targets = 0;
		startPokePower = pokePower;
		while (pokePower >= distance) {

			pokePower -= distance;
			targets++;

			if (startPokePower * 0.5 == pokePower) {

				pokePower /= exhaustionFactor;
			}

		}

		System.out.println(pokePower);
		System.out.println(targets);

		keyboard.close();

	}
}
