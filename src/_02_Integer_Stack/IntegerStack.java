package _02_Integer_Stack;

public class IntegerStack {
	// 1. create a private array of integers
	private int[] numbers;
	// 2. complete the constructor by initializing the member array
	// to a new array of length 0. This prevents null pointer exceptions.
	public IntegerStack() {
		int[] numbers= new int[9];
	}

	// 3. Complete the steps in the push method.
	public void push(int v) {
		// A. create a new array that is one element larger than the member array
		int[] numbers1= new int[numbers.length+1];
		// B. set the last element of the new array equal to the integer passed into the
		// method
		numbers1[numbers1.length-1]= numbers.length-1;
		// C. iterate through the member array and copy all the elements into the new
		// array
		for(int numbers11: numbers1) {
			System.out.println(numbers1);
		}
		// D. set the member array equal to the new array.
		
	}

	// 4. Complete the steps in the pop method.
	public int pop() {
		// A. create an integer variable and initialize it to the
		// last element of the member array.

		// B. create a new array that is one element smaller than the member array

		// C. iterate through the new array and copy every element from the
		// member array to the new array

		// D. set the member array equal to the new array

		// E. return the variable you created in step A
		return 0;
	}

	// 5. Complete the clear method to set the
	// member array to a new array of length 0
	public void clear() {

	}

	// 6. Complete the size array to return
	// the length of the member array
	public int size() {
		return 0;
	}
}
