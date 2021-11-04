package orders;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		Map<String, Integer> productAndQuantity = new LinkedHashMap<>();
		Map<String, Double> productAndPrice = new LinkedHashMap<>();

		String input;

		while (!"buy".equals(input = scanner.nextLine())) {

			String[] data = input.split("\\s+");

			String productName = data[0];
			Double price = Double.parseDouble(data[1]);
			int quantity = Integer.parseInt(data[2]);

			if (!productAndQuantity.containsKey(data[0])) {

				productAndQuantity.put(productName, quantity);
			} else {
				productAndQuantity.put(productName, productAndQuantity.get(productName) + quantity);
			}
			productAndPrice.put(productName, productAndQuantity.get(productName) * price);
		}

		productAndPrice.forEach((k, v) -> System.out.println(String.format("%s -> %.2f", k, v)));

		scanner.close();
	}
}
