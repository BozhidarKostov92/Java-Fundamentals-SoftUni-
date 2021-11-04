package companyUsers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CompanyUsers {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		Map<String, List<String>> company = new TreeMap<>();

		String input = scanner.nextLine();

		while (!"End".equals(input)) {
			String[] data = input.split(" -> ");

			String companyName = data[0];
			String employeeId = data[1];

			company.putIfAbsent(companyName, new ArrayList<String>());
			if (!company.get(companyName).contains(employeeId)) {
				company.get(companyName).add(employeeId);
			}
			input = scanner.nextLine();
		}
		company.entrySet().stream().forEach(c -> {
			System.out.println(c.getKey());
			c.getValue().stream().forEach(n -> System.out.println(String.format("-- %s", n)));
		});

		scanner.close();
	}
}