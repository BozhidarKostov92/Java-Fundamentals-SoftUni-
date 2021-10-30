package opinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Main {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());

		List<Person> people = new ArrayList<>();

		while (n-- > 0) {
			String[] data = scanner.nextLine().split(" ");
			Person person = new Person(data[0], Integer.parseInt(data[1]));
			people.add(person);
		}
		people = people.stream().filter(e -> e.getAge() > 30).sorted(Comparator.comparing(Person::getName))
				.collect(Collectors.toList());

		people.forEach(e -> System.out.println(e.toString()));
		
		scanner.close();

	}
}
