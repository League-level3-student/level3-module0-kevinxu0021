package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	String[] array = new String[5];
	array[1] = "df";
	array[2] = "er";
	array[3] = "dfvg";
	array[4] = "bvn";
	array[5] = "mso";
	public static void main(String[] args) {

		
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	String[] printOrder(String[] array) {
		System.out.println(array);
		return array;
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	String[] printReverse(String[] array) {
		String[] output = new String[array.length];
		int index = 0;
		for (int i = array.length; i > 0; i--) {
			output[index] = array[i];
			index++;
		}
		System.out.println(output);
		return output;
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	String[] printOther(String[] array) {
		String[] output = new String[array.length];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (i / 2 % 2 == 0) {
				output[0] = array[i];
			}
			index++;
		}
		System.out.println(output);
		return output;
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	String[] printRandom(String[] array) {
		int index = 0;
		String[] output = new String[array.length];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			output[index] = array[random.nextInt(array.length)];
		}
		System.out.println(output);
		return output;

	}
}
