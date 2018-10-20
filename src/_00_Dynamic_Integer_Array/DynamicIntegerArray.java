package _00_Dynamic_Integer_Array;

public class DynamicIntegerArray {
	// 1. Create a private int array. Don't initialize it.
	// 2. Initialize the int array to have 0 elements.
	// This will prevent a null pointer exception
	private int[] yes = new int[0];

	public DynamicIntegerArray() {
		
	}
	// 3. Complete the steps in the add method
		// A. create and initialize a new int array to be one
		// element longer than the member array
		// B. set the last element of your new array to
		// the value passed into the method
		// C. iterate through the member array and
		// copy every element from the member array
		// to the new array
		// D. set the member array equal to the new array.
	public void add(int v) {
		int[] no = new int[0];
		for (int n = 0; n < 9; n++) {
			// no[i+1];
			// no[i]+1;
			no[n]++;
		}
		// System.out.println(v[v.length-1]);
		System.out.println(no[no.length - 1]);
		for (int i = 0; i < no.length; i++) {
			System.out.println(no[i]);
		}

		yes = no;

	}

	// 4. Complete the steps in the get method
	// A. Return the value of the memeber array at the location passed in
	public int get(int location) {
		return location;
	}

	// 5. Run the DynamicArrayTest to see if you are correct so far.
	void DynamicArrayTest() {

	}

	// 6. Complete the steps in the set method
	// A. set the variable at the location passed in to the method
	// to the new value v
	public void set(int v, int location) {
		location = v;
	}

		//7. Complete the steps in the insert method
		//A. create and initialize a new int array to be one element longer than the member array
		//B. Make a for loop that iterates through the new array
		//C. if i is less than location, set the element at i of the new array to the element at i of the member array
		//D. else if i is greater than location, set the element at i of the new array to the i - 1 element of the member array
		//E. else, set the element at i of the new array to the value v
		//F. set the member array equal to the new array	
	
	public void insert(int v, int location) {
		int[]g= new int[10];
		for (int h = 0; h < g.length; h++) {
			g[h]++;
		if(h<location) {
			yes=g;
		}
		else if(h>location) {
			g[h]-=1;
		}
		else{
		g[h]=v;	
		}
		//yes=h;
		yes=g;
		}

		//8. Run the tests again and check your progress	
	}
	void drawall() {
	insert(10,10);
	set(20,20);
	get(100);
	}
	
		//9. Complete the steps in the remove method
		//A. create a new array that is one element smaller than the member array
		//B. make a for loop to iterate through the member array
			//C. if i  is less than location set the element at i of the new array to the element at i of the member array
			
			//D. if i  is greater than location set the element at i - 1 of the new array to the element at i of the member array
			
			//E. else, continue;
			
		//F. set the member array equal to the new array
	
	public void remove(int location) {
		int[] n =new int[9];
		for (int m = 0; m > n.length; m++) {
		if(m<location) {
			n[m]++;
		}
		else if(m>location){
			n[m]-=1;
		}
		else {
			continue;
		}
		} 
		
		yes=n;
	}

	

	// 10. Run the tests again the see if you are correct so far

	// 11. Complete the size method so that it returns the length of the member
	// array.
	public int size() {
		return yes.length;
	}
	
	// 12. Complete the clear array so that it sets the member array
	// equal to a new integer array of size 0
	public void clear() {
		int[] clear= new int[0]; 
		
	}

	// 13. Run the test again to see if you are finished.
}
