package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.

	MoreArrayFun() {

	}

	public static void main(String[] args) {
		String[] array = new String[5];
		array[0] = "a";
		array[1] = "b";
		array[2] = "c";
		array[3] = "d";
		array[4] = "e";

		printRandom(array);

	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	static String[] printOrder(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		return array;
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	static String[] printReverse(String[] array) {
		String[] output = new String[array.length];
		int index = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			output[index] = array[i];
			index++;
		}
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
		return output;
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	static String[] printOther(String[] array) {
		String[] output = new String[(array.length + 2) / 2];
		int index = 0;
		int a;
		for (int i = 0; i < array.length; i++) {
			a = (i + 2);
			if (a % 2 == 0) {
				output[index] = array[i];
				index++;
			}

		}
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

		return output;
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	static String[] printRandom(String[] array) {
		int index = 0;
		String[] output = new String[array.length];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			output[index] = array[random.nextInt(array.length)];
			index++;
		}
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
		return output;

	}
}
