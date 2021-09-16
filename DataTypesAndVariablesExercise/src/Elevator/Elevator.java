package Elevator;

import java.util.Scanner;

public class Elevator {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		int people, capacity, sum;

		people = keyboard.nextInt();
		capacity = keyboard.nextInt();

		sum = people / capacity;

		if (people % capacity != 0) {

			sum++;
		}

		System.out.println(sum);

		keyboard.close();
	}
}
