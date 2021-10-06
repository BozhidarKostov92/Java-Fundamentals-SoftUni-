package BeerKegs;

import java.util.Scanner;

public class BeerKegs {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int counter = Integer.parseInt(keyboard.nextLine());

		double maxVolume = 0;
		String biggestKeg = "";

		while (counter-- > 0) {

			String model = keyboard.nextLine();
			double radius = Double.parseDouble(keyboard.nextLine());
			int height = Integer.parseInt(keyboard.nextLine());

			double volume = Math.PI * (radius * radius) * height;

			if (volume > maxVolume) {
				maxVolume = volume;
				biggestKeg = model;
			}
		}

		System.out.println(biggestKeg);

		keyboard.close();

	}
}
