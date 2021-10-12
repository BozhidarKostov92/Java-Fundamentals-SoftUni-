package changeList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ChangeList {

	public static void main(String args[]) throws IOException {

		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> numbers = Arrays.stream(read.readLine().split("\\s")).map(Integer::parseInt)
				.collect(Collectors.toList());

		String input;
		int insertNumber = 0;
		int indexInsertNumber = 0;

		while (!"end".equals(input = read.readLine())) {
			String[] data = input.split("\\s+");

			if (data[0].equals("Delete")) {

				while (numbers.contains(Integer.parseInt(data[1]))) {
					numbers.remove(Integer.valueOf(Integer.parseInt(data[1])));
				}
			}

			else if (data[0].equals("Insert")) {

				insertNumber = Integer.parseInt(data[1]);
				indexInsertNumber = Integer.parseInt(data[2]);

				numbers.add(indexInsertNumber, insertNumber);

			}
		}

		System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
	}
}
