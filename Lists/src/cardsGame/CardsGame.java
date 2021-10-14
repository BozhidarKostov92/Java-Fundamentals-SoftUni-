package cardsGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CardsGame {

	public static void main(String args[]) throws IOException {

		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> firstPlayer = Arrays.stream(read.readLine().split("\\s+")).map(Integer::parseInt)
				.collect(Collectors.toList());
		List<Integer> secondPlayer = Arrays.stream(read.readLine().split("\\s+")).map(Integer::parseInt)
				.collect(Collectors.toList());

		while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty()) {

			if (firstPlayer.get(0) > secondPlayer.get(0)) {
				firstPlayer.add(secondPlayer.get(0));
				firstPlayer.add(firstPlayer.get(0));
				firstPlayer.remove(0);
				secondPlayer.remove(0);
			} else if ((firstPlayer.get(0)) < secondPlayer.get(0)) {
				secondPlayer.add(firstPlayer.get(0));
				secondPlayer.add(secondPlayer.get(0));
				secondPlayer.remove(0);
				firstPlayer.remove(0);
			} else {
				firstPlayer.remove(0);
				secondPlayer.remove(0);
			}
		}
		String winner;
		if (firstPlayer.size() > secondPlayer.size()) {
			winner = "First player wins! Sum: " + firstPlayer.stream().mapToInt(e -> e).sum();
		} else {
			winner = "Second player wins! Sum: " + secondPlayer.stream().mapToInt(e -> e).sum();
		}

		System.out.println(winner);
	}
}
