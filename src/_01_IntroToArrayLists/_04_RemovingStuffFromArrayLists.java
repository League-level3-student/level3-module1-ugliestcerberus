package _01_IntroToArrayLists;

import java.util.ArrayList;

/**
 * Copyright The League of Amazing Programmers 2013-2017 Level 3 Two ArrayList
 * Cleaning Exercises Duration=.00 Platform=Eclipse Type=Recipe Objectives=
 */

public class _04_RemovingStuffFromArrayLists {

	public static void main(String[] args) {

		class Stuff {
			public String type;
		}
		class Worm extends Stuff {
			public Worm() {
				type = "worm";
			}
		}
		class Dirt extends Stuff {
			public Dirt() {
				type = "dirt";
			}
		}
		ArrayList<Stuff> stuffIFoundInTheYard = new ArrayList<Stuff>();
		stuffIFoundInTheYard.add(new Worm());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Worm());
		stuffIFoundInTheYard.add(new Dirt());

		/* TODO 1: Clean out the dirt but keep the delicious worms. */
		// anything that is character should be surrounded with single quotation marks
		// stuffIFoundInTheYard.remove

		for (int y = 0; y < stuffIFoundInTheYard.size(); y++) {
			// This for loop sets an array
			stuffIFoundInTheYard.remove(y);
			// This array loops once through the array and removes the values
			if (stuffIFoundInTheYard.get(y).equals("dirt")) {
				// sets a condition of what shall be removed
				System.out.println(stuffIFoundInTheYard.get(y));
				// This gets the values that weren't removed.
			}
			System.out.println(stuffIFoundInTheYard.size());
			// This prints the number of values that are left in the array.
		}

		System.out.println(stuffIFoundInTheYard.size()); // should be 2

		ArrayList<Character> truth = new ArrayList<Character>();
		truth.add('c');
		truth.add('a');
		truth.add('#');
		truth.add('l');
		truth.add('#');
		truth.add('i');
		truth.add('f');
		truth.add('o');
		truth.add('#');
		truth.add('r');
		truth.add('n');
		truth.add('#');
		truth.add('i');
		truth.add('#');
		truth.add('a');
		truth.add('#');
		truth.add(' ');
		truth.add('i');
		truth.add('#');
		truth.add('s');
		truth.add('#');
		truth.add(' ');
		truth.add('w');
		truth.add('#');
		truth.add('a');
		truth.add('r');
		truth.add('#');
		truth.add('m');
		truth.add('e');
		truth.add('r');
		truth.add('#');
		/* TODO 2: Remove the hash symbols and print out the truth. */
		for (int m = 0; m < truth.size(); m++) {
			if (truth.get(m) == '#') {
				truth.remove(m);
				m--;
			} else {
				System.out.println(truth.get(m));
			}

		}
	}
}
