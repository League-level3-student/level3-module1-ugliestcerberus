package _01_IntroToArrayLists;

/** Copyright The League of Amazing Programmers 2013-2017
 *    Level 3
 *    A Murder of Crows
 *    Duration=.00
 *    Platform=Eclipse
 *    Type=Recipe
 *    Objectives=n/a
*/

import java.util.ArrayList;
import java.util.Random;

public class _03_MurderOfCrows {

	ArrayList<Crow> theMurder = new ArrayList<Crow>();
	int count;

	public static void main(String[] args) {
		_03_MurderOfCrows murderOfCrows = new _03_MurderOfCrows();
		murderOfCrows.initializeCrows();
		murderOfCrows.findTheDiamond();

	}

	private void findTheDiamond() {
		/*
		 * 1. One of the Crows has eaten the diamond. You need to search through the
		 * stomach of each Crow, then print the name of the guilty Crow.
		 */

		for (int y = 0; y < theMurder.size(); y++) {
			ArrayList<String> contents = theMurder.get(y).getStomachContents();
			for (int u = 0; u < contents.size(); u++) {
				if (contents.get(u).equals("diamond")) {
					System.out.println(theMurder.get(y).getName());
				} else {
					count++;
				}
			}
			System.out.println(y);
		}
		System.out.println(count);
		System.out.println(count + " cows had to die");
	}
	/* 2. How many innocent crows had to die before the diamond was found? */

	private void initializeCrows() {
		theMurder.add(new Crow("Rok"));
		theMurder.add(new Crow("Merle"));
		theMurder.add(new Crow("Poe"));
		theMurder.add(new Crow("Grenwyn"));
		theMurder.add(new Crow("Crawford"));
		hideTheDiamond();
	}

	private void hideTheDiamond() {
		int randomness = new Random().nextInt(theMurder.size());
		theMurder.get(randomness).getStomachContents().add("diamond");
	}
}

class Crow {
	private String name;
	private ArrayList<String> stomachContents = new ArrayList<String>();

	public Crow(String name) {
		this.name = name;
		fillCrowsStomach();
	}

	// public boolean getStomachContents(String string) {

	// return false;
	// }

	private void fillCrowsStomach() {
		for (int i = 0; i < 10; i++)
			this.stomachContents.add(getRandomCrowFood());
	}

	private String getRandomCrowFood() {
		int randomness = new Random().nextInt(4);
		if (randomness == 0)
			return "carrion";
		else if (randomness == 1)
			return "snail";
		else if (randomness == 2)
			return "acorn";
		else if (randomness == 3)
			return "spider";
		else
			return "grub";
	}

	public String getName() {
		return name;
	}

	public ArrayList<String> getStomachContents() {
		return stomachContents;
	}

}
