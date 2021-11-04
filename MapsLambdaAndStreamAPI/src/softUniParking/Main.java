package softUniParking;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int lines = Integer.parseInt(scanner.nextLine());
		String input;
		Map<String, String> parkingRegs = new LinkedHashMap<>();
		for (int i = 1; i <= lines; i++) {

			input = scanner.nextLine();
			String[] data = input.split("\\s+");
			String regOrUnreg = data[0];
			String username = data[1];

			if (regOrUnreg.equals("register")) {

				if (!parkingRegs.containsKey(username)) {
					String licensePlates = data[2];
					parkingRegs.put(username, licensePlates);
					System.out.printf("%s registered %s successfully\n", username, licensePlates);
				} else {
					System.out.println("ERROR: already registered with plate number " + parkingRegs.get(username));
				}
			}

			else {
				if (!parkingRegs.containsKey(username)) {
					System.out.println("ERROR: user " + username + " not found");
				} else {
					parkingRegs.remove(username);
					System.out.printf("%s unregistered successfully\n", username);
				}
			}
		}
		parkingRegs.forEach((k, v) -> System.out.println(String.format("%s => %s", k, v)));
		scanner.close();
	}
}
