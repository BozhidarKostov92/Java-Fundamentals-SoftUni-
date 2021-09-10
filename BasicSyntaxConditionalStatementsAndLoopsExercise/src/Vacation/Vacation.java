package Vacation;

import java.util.Scanner;

public class Vacation {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int people = keyboard.nextInt();
		String typeOfGroup = keyboard.next();
		String dayOfWeek = keyboard.next();

		double pricePerson = 0.0;
		double totalPrice = 0.0;

		if (typeOfGroup.equals("Students")) {
			if (dayOfWeek.equals("Friday"))
				pricePerson = 8.45;
			if (dayOfWeek.equals("Saturday"))
				pricePerson = 9.80;
			if (dayOfWeek.equals("Sunday"))
				pricePerson = 10.46;

		}

		else if (typeOfGroup.equals("Business")) {
			if (dayOfWeek.equals("Friday"))
				pricePerson = 10.90;
			if (dayOfWeek.equals("Saturday"))
				pricePerson = 15.60;
			if (dayOfWeek.equals("Sunday"))
				pricePerson = 16;

		}

		else if (typeOfGroup.equals("Regular")) {
			if (dayOfWeek.equals("Friday"))
				pricePerson = 15;
			if (dayOfWeek.equals("Saturday"))
				pricePerson = 20;
			if (dayOfWeek.equals("Sunday"))
				pricePerson = 22.50;
		}

		if (typeOfGroup.equals("Business") && people >= 100) {
			people -= 10;
		}

		totalPrice = pricePerson * people;

		if (typeOfGroup.equals("Students") && people >= 30) {
			totalPrice *= 0.85;
		}
		if (typeOfGroup.equals("Regular") && (people >= 10 && people <= 20)) {
			totalPrice *= 0.95;
		}

		System.out.printf("Total price: %.2f", totalPrice);
		
		keyboard.close();

	}
}
