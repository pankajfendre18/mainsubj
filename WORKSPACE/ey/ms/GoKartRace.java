package com.ey.ms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Player {
	String name;
	double finishTime; // Time in seconds

	public Player(String name, double finishTime) {
		this.name = name;
		this.finishTime = finishTime;
	}
}

public class GoKartRace {
	public static void main(String[] args) {
		List<Player> players = new ArrayList<>();
		players.add(new Player("Player 1", 125.5));
		players.add(new Player("Player 2", 119.2));
		players.add(new Player("Player 3", 130.8));
		players.add(new Player("Player 4", 122.9));

		// Sort players based on finish time (ascending order)
//		players.sort(Comparator.comparingDouble(p -> p.finishTime));

		// Display ranking
//		for (int i = 0; i < players.size(); i++) {
//			System.out.println((i + 1) + "️ Place: " + players.get(i).name + " (Time: " + players.get(i).finishTime + "s)");
//		}
		
		players.stream().sorted(Comparator.comparingDouble(p -> p.finishTime))
		.forEach(p -> System.out.println(p.name + " (Time: " + p.finishTime + "s)"));
		
		
	}
}