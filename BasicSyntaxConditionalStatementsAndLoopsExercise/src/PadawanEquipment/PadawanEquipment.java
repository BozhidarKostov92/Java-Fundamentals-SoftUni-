package PadawanEquipment;

import java.util.Scanner;

public class PadawanEquipment {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		float amountOfMoney, priceOfLightsabers, priceOfRobes, priceOfBelts, costEquipment, needMoney;

		amountOfMoney = keyboard.nextFloat();
		int students = keyboard.nextInt();
		priceOfLightsabers = keyboard.nextFloat();
		priceOfRobes = keyboard.nextFloat();
		priceOfBelts = keyboard.nextFloat();

		float brakeLightsabers = (float) Math.ceil(students * 0.1);
		float moreLightsabers = students + brakeLightsabers;
		float freeBelt = (float) Math.floor(students / 6);

		float discountBelt = students - freeBelt;
		costEquipment = (float) (priceOfLightsabers * moreLightsabers) + (priceOfRobes * students)
				+ (priceOfBelts * discountBelt);

		needMoney = costEquipment - amountOfMoney;

		if (costEquipment <= amountOfMoney) {

			System.out.printf("The money is enough - it would cost %.2flv.", costEquipment);

		}

		else {

			System.out.printf("George Lucas will need %.2flv more.", needMoney);

		}

		keyboard.close();

	}
}