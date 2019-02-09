package _03_IntroToStacks;

import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		// 1. Create a Stack of Doubles
		// Don't forget to import the Stack class
		Stack<Double> man = new Stack<Double>();
		Stack<Double> math = new Stack<Double>();

		// 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (double y = 0; y < 101; y++) {
			double h = Math.random() * 1000;
			man.push(h);
			// Review this
		}

		// 3. Ask the user to enter in two numbers between 0 and 100, inclusive.
		String jasl = JOptionPane.showInputDialog("Enter two numbers between 0 to 100");
		String mask = JOptionPane.showInputDialog("Ennter two numbers between 0 to 100");
		Double firstnumber = Double.parseDouble(jasl);
		Double secondnumber = Double.parseDouble(mask);

		// 4. Pop all the elements off of the Stack. Every time a double is popped that
		// is between the two numbers entered by the user, print it to the screen.
		int mk = math.size();

		// for (int n = 0; n < mk; n ++) {
		while (!math.empty()) {
			System.out.println(math.pop());

		}

		// }

		// EXAMPLE:
		// NUM 1: 65
		// NUM 2: 75

		// Popping elements off stack...
		// Elements between 65 and 75:
		// 66.66876846
		// 74.51651681
		// 70.05110654
		// 69.21350456
		// 71.54506465
		// 66.47984807
		// 74.12121224
	}
}
