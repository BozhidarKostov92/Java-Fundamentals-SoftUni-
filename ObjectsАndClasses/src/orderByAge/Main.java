package orderByAge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class Main {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		List<Person> persons = new ArrayList<>();
		String input;

		while (!"End".equals(input = scanner.nextLine())) {
			String[] data = input.split("\\s+");
			Person person = new Person(data[0], data[1], Integer.parseInt(data[2]));
			persons.add(person);
		}

		persons.stream().sorted(Comparator.comparingInt(e -> e.age)).forEach(e -> System.out.println(e.toString()));

		scanner.close();
	}
}