package vehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		String input;

		List<Vehicle> vehicles = new ArrayList<>();

		while (!"End".equals(input = scanner.nextLine())) {
			String[] data = input.split("\\s+");

			String model = data[0].substring(0, 1).toUpperCase() + data[0].substring(1);

			Vehicle vehicle = new Vehicle(model, data[1], data[2], Integer.parseInt(data[3]));
			vehicles.add(vehicle);
		}

		while (!"Close the Catalogue".equals(input = scanner.nextLine())) {

			for (Vehicle vehicle : vehicles) {
				if (input.equals(vehicle.getModel())) {
					System.out.println(vehicle.toString());
					break;
				}
			}
		}

		Vehicle vehicle = new Vehicle();

		System.out.printf("Cars have average horsepower of: %.2f.\n", vehicle.getAveragePower("Car", vehicles));
		System.out.printf("Trucks have average horsepower of: %.2f.\n", vehicle.getAveragePower("Truck", vehicles));

		scanner.close();
	}
}
