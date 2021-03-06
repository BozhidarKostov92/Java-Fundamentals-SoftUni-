package listOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOperations {

	public static void main(String args[]) throws IOException {

		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> numbers = Arrays.stream(read.readLine().split("\\s")).map(Integer::parseInt)
				.collect(Collectors.toList());

		String input;

		while (!"End".equals(input = read.readLine())) {
			String[] data = input.split("\\s+");

			if (data[0].equals("Remove")) {

				if (checkIndex(numbers, data[1])) {
					numbers.remove(Integer.parseInt(data[1]));
				}

			} else if (data[0].equals("Insert")) {

				if (checkIndex(numbers, data[2])) {
					numbers.add(Integer.parseInt(data[2]), Integer.parseInt(data[1]));
				}
			} else if (data[0].equals("Add")) {

				numbers.add(Integer.parseInt(data[1]));

			} else if (data[0].equals("Shift")) {
				int count = Integer.parseInt(data[2]);
				if (data[1].equals("left")) {
					for (int i = 0; i < count; i++) {
						numbers.add(numbers.get(0));
						numbers.remove(0);
					}
				} else {

					for (int j = 0; j < count; j++) {
						numbers.add(0, numbers.get(numbers.size() - 1));
						numbers.remove(numbers.size() - 1);
					}
				}
			}
		}

		System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

	}

	private static boolean checkIndex(List<Integer> nums, String index) {
		int i = Integer.parseInt(index);
		if (i >= 0 && i < nums.size()) {
			return true;
		} else {
			System.out.println("Invalid index");
			return false;
		}
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              