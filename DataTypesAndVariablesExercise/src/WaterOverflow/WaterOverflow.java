package WaterOverflow;

import java.util.Scanner;

public class WaterOverflow {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int numberLines = keyboard.nextInt();

		int waterTankL = 255;
		int sumLitters = 0;
		for (int i = 1; i <= numberLines; i++) {

			int fillTankL = keyboard.nextInt();

			sumLitters += fillTankL;

			if (fillTankL > waterTankL || sumLitters > waterTankL) {

				System.out.println("Insufficient capacity!");
				sumLitters -= fillTankL;

			}
		}

		System.out.println(sumLitters);

		keyboard.close();
	}
}