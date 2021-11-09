package forceBook;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		Map<String, TreeSet<String>> sides = new LinkedHashMap<>();

		String input;

		while (!"Lumpawaroo".equals(input = scanner.nextLine())) {

			String[] data = input.split("\\s+\\|\\s+|\\s+->\\s+");

			if (input.contains("|")) {
				if (!sides.containsKey(data[0])) {
					sides.put(data[0], new TreeSet<>());
				}

				boolean contains = false;

				for (Map.Entry<String, TreeSet<String>> kvp : sides.entrySet()) {
					if (kvp.getValue().contains(data[1])) {
						contains = true;
						break;
					}
				}
				if (!contains) {
					sides.get(data[0]).add(data[1]);
				}

			} else {
				sides.forEach((k, v) -> v.remove(data[0]));

				if (!sides.containsKey(data[1])) {
					sides.put(data[1], new TreeSet<>());
				}

				sides.get(data[1]).add(data[0]);
				System.out.println(String.format("%s joins the %s side!", data[0], data[1]));
			}
		}
		sides.entrySet().stream().filter(e -> e.getValue().size() > 0).sorted((e1, e2) -> {
			int compare = Integer.compare(e2.getValue().size(), e1.getValue().size());
			if (compare == 0) {
				compare = e1.getKey().compareTo(e2.getKey());
			}
			return compare;
		}).forEach(e -> {
			System.out.println(String.format("Side: %s, Members: %s", e.getKey(), e.getValue().size()));
			e.getValue().forEach(b -> System.out.println("! " + b));
		});

		scanner.close();
	}
}