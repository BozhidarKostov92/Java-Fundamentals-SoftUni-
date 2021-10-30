package Articles2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());
		List<Articles> article = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String[] data = scanner.nextLine().split(", ");
			Articles articles = new Articles(data[0], data[1], data[2]);
			article.add(articles);
		}
		switch (scanner.nextLine()) {
		case "title":
			article = article.stream().sorted(Comparator.comparing(Articles::getTitle)).collect(Collectors.toList());
			break;
		case "content":
			article = article.stream().sorted(Comparator.comparing(Articles::getContent)).collect(Collectors.toList());
			break;
		case "author":
			article = article.stream().sorted(Comparator.comparing(Articles::getAuthor)).collect(Collectors.toList());
			break;
		}

		article.forEach(e -> System.out.println(e.toString()));

		scanner.close();
	}
}