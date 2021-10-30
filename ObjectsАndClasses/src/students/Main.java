 package students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		int numberOfStudents = Integer.parseInt(scanner.nextLine());
		List<Student> students = new ArrayList<>();

		for (int i = 0; i < numberOfStudents; i++) {
			String[] data = scanner.nextLine().split(" ");
			String firstName = data[0];
			String secondName = data[1];
			double grade = Double.parseDouble(data[2]);
			Student student = new Student(firstName, secondName, grade);
			students.add(student);
		}
		
		scanner.close();

	}
}
