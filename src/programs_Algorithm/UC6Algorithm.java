package programs_Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class UC6Algorithm {

	/**
	 * This method is created to check the two strings are anagrams or not.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Taking input from the user.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String string1 = scanner.nextLine();
		System.out.print("Enter the second string: ");
		String string2 = scanner.nextLine();
		scanner.close();

		/**
		 * Check if the two strings are anagrams or not.
		 */
		if (areAnagrams(string1, string2)) {
			System.out.println("The two strings are anagrams.");
		} else {
			System.out.println("The two strings are not anagrams.");
		}

	}

	public static boolean areAnagrams(String string1, String string2) {
		/**
		 * Convert the strings to character arrays and sort them
		 */
		char[] first = string1.toCharArray();
		char[] second = string2.toCharArray();
		Arrays.sort(first);
		Arrays.sort(second);

		/**
		 * To check if the sorted arrays are equalor not .
		 */
		return Arrays.equals(first, second);
	}
}
