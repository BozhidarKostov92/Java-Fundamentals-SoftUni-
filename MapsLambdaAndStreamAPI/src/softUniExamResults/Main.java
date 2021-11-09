package softUniExamResults;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		Map<String, Integer> submissionsCont = new LinkedHashMap<>();
		Map<String, Integer> nameAndPoints = new LinkedHashMap<>();

		String input;

		while (!"exam finished".equals(input = scanner.nextLine())) {

			String[] data = input.split("[\\-]+");

			if (data[1].equals("banned")) {

				nameAndPoints.remove(data[0]);
			} else {
				if (!nameAndPoints.containsKey(data[0])) {
					nameAndPoints.putIfAbsent(data[0], Integer.parseInt(data[2]));

					submissionsCont.putIfAbsent(data[1], 0);
					submissionsCont.put(data[1], submissionsCont.get(data[1]) + 1);
				} else {

					if (nameAndPoints.get(data[0]) < Integer.parseInt(data[2])) {
						nameAndPoints.replace(data[0], Integer.parseInt(data[2]));
					}
					submissionsCont.put(data[1], submissionsCont.get(data[1]) + 1);
				}
			}
		}
		System.out.println("Results:");
		nameAndPoints.entrySet().stream().sorted((e1, e2) -> {
			int a = Integer.compare(e2.getValue(), e1.getValue());
			if (a == 0) {
				a = e1.getKey().compareTo(e2.getKey());
			}
			return a;
		}).forEach((e) -> System.out.println(String.format("%s | %s", e.getKey(), e.getValue())));

		System.out.println("Submissions:");
		submissionsCont.entrySet().stream().sorted((e1, e2) -> {
			int a = Integer.compare(e2.getValue(), e1.getValue());
			if (a == 0) {
				a = e1.getKey().compareTo(e2.getKey());
			}
			return a;
		}).forEach(e -> System.out.println(String.format("%s - %s", e.getKey(), e.getValue())));
		scanner.close();
	}
}
