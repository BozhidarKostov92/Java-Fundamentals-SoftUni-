package houseParty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HouseParty {

	public static void main(String args[]) throws IOException {

		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

		int lines = Integer.parseInt(read.readLine());
		int countLines = 1;

		List<String> guests = new ArrayList<>();
		String input = "";

		while (countLines <= lines) {

			input = read.readLine();
			String[] data = input.split("\\s+");

			if (data[2].equals("going!")) {

				if (guests.contains(data[0])) {

					System.out.println(data[0] + " is already in the list! ");
				}

				else {
					guests.add(data[0]);
				}
			} else if (data[2].equals("not")) {

				if (!guests.contains(data[0])) {
					System.out.println(data[0] + " is not in the list! ");
				} else {
					guests.remove(data[0]);
				}
			}

			countLines++;
		}
		for (String element : guests)
			System.out.println(element);

	}
}
