package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] array = { "a", "b", "c", "d", "e" };
		// 2. print the third element in the array
		System.out.println(array[3]);
		// 3. set the third element to a different value
		array[3] = "f";
		// 4. print the third element again
		System.out.println(array[3]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int i = 0; i < array.length; i++) {
			array[i] = "g";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		// 7. make an array of 50 integers
		int[] array1 = new int[50];
		// 8. use a for loop to make every value of the integer array a random number
		Random random = new Random();
		int randomNumber;
		for (int i = 0; i < array1.length; i++) {
			randomNumber = random.nextInt();
			array1[i] = randomNumber;
		}
		// 9. without printing the entire array, print only the smallest number on the
		// array
		int smallestNumber = array1[1];
		for (int i = 0; i < array1.length; i++) {
			if (smallestNumber >= array1[i]) {
				smallestNumber = array1[i];
			}
		}
		System.out.println(smallestNumber);
		// 10 print the entire array to see if step 8 was correct
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + ", ");
		}
		// 11. print the largest number in the array.
		int largestNumber = array1[1];
		for (int i = 0; i < array1.length; i++) {
			if (largestNumber <= array1[i]) {
				largestNumber = array1[i];
			}
		}
		System.out.println("\n" + largestNumber);
		// 12. print only the last element in the array
		System.out.println(array1[array1.length - 1]);
	}
}
