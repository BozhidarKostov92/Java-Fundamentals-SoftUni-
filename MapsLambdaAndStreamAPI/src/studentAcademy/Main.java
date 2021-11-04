package studentAcademy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());
		Map<String, List<Double>> students = new LinkedHashMap<>();

		for (int i = 1; i <= n; i++) {

			String student = scanner.nextLine();
			Double grade = Double.parseDouble(scanner.nextLine());
			students.putIfAbsent(student, new ArrayList<>());
			students.get(student).add(grade);
		}
		students.entrySet().stream()
				.filter(s -> s.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble() >= 4.50)
				.sorted((s1, s2) -> {
					double first = s1.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
					double second = s2.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
					return Double.compare(second, first);
				}).forEach(s -> System.out.printf("%s -> %.2f\n", s.getKey(),
						s.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble()));
		scanner.close();
	}
}
