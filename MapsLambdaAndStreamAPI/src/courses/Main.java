package courses;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		Map<String, List<String>> courses = new LinkedHashMap<>();

		String input = scanner.nextLine();

		while (!"end".equals(input)) {
			String[] data = input.split(" : ");

			String course = data[0];
			String student = data[1];

			courses.putIfAbsent(course, new ArrayList<String>());
			courses.get(course).add(student);

			input = scanner.nextLine();

		}
		courses.entrySet().stream().sorted((c1, c2) -> {
			int first = c1.getValue().size();
			int second = c2.getValue().size();
			return Integer.compare(second, first);

		}).forEach(c -> {
			System.out.println(String.format("%s: %d", c.getKey(), c.getValue().size()));

			c.getValue().stream().sorted().forEach(s -> System.out.println(String.format("-- %s", s)));

		});

		scanner.close();
	}
}
