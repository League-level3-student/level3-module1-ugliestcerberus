package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		//2. Add five Strings to your list
		String[] sayings= {"awesome","realistic","magnificient","lethargic", "energetic"};
		//3. Print all the Strings using a standard for-loop
		for(int u = 0; u< 5; u++) {
			System.out.println(sayings[u]);
		}
		//4. Print all the Strings using a for-each loop
		for(int h= 0; h< 5; h++) {
			//System.out.println(sayings);
			System.out.println(sayings[h]);
		}
		//5. Print only the even numbered elements in the list.
		for(int g=0;g<5;g+=2) {
			//System.out.println(sayings);
			System.out.println(sayings[g]);
		}
		//6. Print all the Strings in reverse order.
		for(int j=5; j<-1; j--) {
			//System.out.println(sayings);
			System.out.println(sayings[j]);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		//System.out.println(x);
		//sayings.charAt(2);
			
		}
	}

