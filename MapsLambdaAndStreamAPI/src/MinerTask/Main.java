package MinerTask;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		String input;
		Map<String, Integer> data = new LinkedHashMap<>();

		while (!"stop".equals(input = scanner.nextLine())) {

			String input2 = scanner.nextLine();

			data.putIfAbsent(input, 0);
			data.put(input, data.get(input) + Integer.parseInt(input2));
		}

		data.forEach((k, v) -> System.out.println(String.format("%s -> %d", k, v)));

		scanner.close();
	}
}
