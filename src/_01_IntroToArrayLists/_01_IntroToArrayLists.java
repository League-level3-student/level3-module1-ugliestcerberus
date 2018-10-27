package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		// 2. Add five Strings to your list
		ArrayList<String> sayings = new ArrayList<String>();
		sayings.add("Matthew is awesome");
		sayings.add("Reading, Writing, Math");
		sayings.add("I like food");
		sayings.add("I want to sleep");
		System.out.println("next");
		// sayings.remove(0);
		// This code is there to show that this is very similar to the concepts of
		// understanding arrays.
		// System.out.println(sayings.get(0));
		// This code is there to show that this is very similar to the concepts of
		// understanding arrays, too.
		// This code shows which element of the arraylist shall be printed.
		// The first element starts with zero and the number element increases by one
		// when we add a element.
		// parenthesis is for setting up the contructor
		// 3. Print all the Strings using a standard for-loop
		for (int u = 0; u < sayings.size(); u++) {
			System.out.println(sayings.get(u));
		}
		System.out.println("nest");
		// 4. Print all the Strings using a for-each loop
		for (String s : sayings) {
			System.out.println(s);
		}
		System.out.println("then");
		// 5. Print only the even numbered elements in the list.
		for (int g = 0; g < sayings.size(); g += 2) {
			// System.out.println(sayings);
			System.out.println(sayings.get(g));
		}
		System.out.println("two more");
		// 6. Print all the Strings in reverse order.
		for (int j = sayings.size() - 1; j >= 0; j--) {
			System.out.println(sayings.get(j));
		}
		System.out.println("Last");
		// 7. Print only the Strings that have the letter 'e' in them.
		for (int m = 0; m < sayings.size(); m++) {
			if (sayings.get(m).contains("e")) {
				System.out.println(sayings.get(m));
			}
		}
		System.out.println("e");
	}
}
