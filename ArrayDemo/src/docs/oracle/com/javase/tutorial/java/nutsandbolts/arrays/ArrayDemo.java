package docs.oracle.com.javase.tutorial.java.nutsandbolts.arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// declares an array of integers
		int[] myIntArray;

		// allocates memory for 3 integers.
		myIntArray = new int[3];
		
		// initialize first element
		myIntArray[0] = 100;

        // initialize second element
		myIntArray[1] = 200;
		
		// initialize third element
		myIntArray[2] = 300;
		
		System.out.println("Element at index 0: " + myIntArray[0] + ".\tFirst element!");
		System.out.println("Element at index 1: " + myIntArray[1] + ".\tSecond element!");
		System.out.println("Element at index 2: " + myIntArray[2] + ".\tThird element!");
	}

}
