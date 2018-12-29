package _01_IntroToArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class _05_LongChipCompetition {
	/**
	 * The Beatles are eating lunch and playing a game to see who has the longest
	 * chip. (In England, french fries are called "chips".) * Find the Beatle with
	 * the longest chip. You may not edit the Chip or Beatle classes. Make sure to
	 * initialize The Beatles before you start your search. *
	 **/
	private ArrayList<Beatle> theBeatles = new ArrayList<Beatle>();
	// This is the member variable.

	public static void main(String[] args) {
		_05_LongChipCompetition lcc = new _05_LongChipCompetition();
		lcc.initializeBeatles();
		Object largest;

		// This is the object made from the class.
		// for (int o = 0; o < lcc.theBeatles.size(); o++) {
		// ArrayList<Chip> thepeople = new ArrayList<Chip>();
		// lcc.theBeatles.get(0);
		// lcc.initializeBeatles();
		// for (int y = 0; y < lcc.theBeatles.size(); y++) {
		// ArrayList<Chip> thenames = new ArrayList<Chip>();
		// lcc.theBeatles.get(j).getChips();
		// lcc.theBeatles.initializePlateOfChips();
		// for(Object Beatles: {
		// lcc.theBeatles.get(0);
		// lcc.getTheBand();
		// }
		for (int h = 0; h < lcc.theBeatles.size(); h++) {
			ArrayList<Chip> current = lcc.theBeatles.get(h).getChips();
			largest = current.get(h).getLength();
			for (int j = 0; j < current.size(); j++) {
				// System.out.println(current);

				System.out.println(largest);
				if (current.get(h) == largest) {
					System.out.println(lcc.theBeatles);

				}
			}

		}
	}

	// }
	// }

	// }

	private void initializeBeatles() {
		Beatle george = new Beatle("George");
		Beatle john = new Beatle("John");
		Beatle paul = new Beatle("Paul");
		Beatle ringo = new Beatle("Ringo");
		theBeatles.add(george);
		theBeatles.add(john);
		theBeatles.add(paul);
		theBeatles.add(ringo);
	}

	public ArrayList<Beatle> getTheBand() {
		return theBeatles;
	}
}

class Beatle {
	private String name;
	private ArrayList<Chip> chips = new ArrayList<Chip>();

	public Beatle(String name) {
		this.name = name;
		initializePlateOfChips();
	}

	private void initializePlateOfChips() {
		int numberOfChips = new Random().nextInt(100);
		for (int i = 0; i < numberOfChips; i++) {
			chips.add(new Chip(new Random().nextDouble() * 10));
		}
	}

	public ArrayList<Chip> getChips() {
		return this.chips;
	}

	public String getName() {
		return this.name;
	}
}

class Chip {
	private double length;

	public double getLength() {
		return length;
	}

	Chip(double d) {
		this.length = d;
	}
}
