package advertisementMessage;

import java.util.Random;
import java.util.Scanner;

public class Main {

	static class Message {
		String[] phrases = { "Excellent product.", "Such a great product.", "I always use that product.",
				"Best product of its category.", "Exceptional product.", "I can’t live without this product." };
		String[] events = { "Now I feel good.", "I have succeeded with this product.",
				"Makes miracles.I am happy of the results!", "I cannot believe but now I feel awesome.",
				"Try it yourself, I am very satisfied.", "I feel great!" };
		String[] author = { "Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva" };
		String[] cities = { "Burgas", "Sofia", "Plovdiv", "Varna", "Ruse" };

		public String randomMessage() {

			Random rnd = new Random();

			return String.format("%s %s %s - %s", phrases[rnd.nextInt(phrases.length)],
					events[rnd.nextInt(events.length)], author[rnd.nextInt(author.length)],
					cities[rnd.nextInt(cities.length)]);
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Message message = new Message();

		int n = Integer.parseInt(input.nextLine());

		int lines = 0;

		while (lines < n) {

			System.out.println(message.randomMessage());

			lines++;
		}
		input.close();
	}
}