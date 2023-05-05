package programs_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UC1Algorithm {

	/**
	 * This method is created to compare iterative and recursion method to find the
	 * permutations of a string.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "sai";
		String[] permutations1 = findPermutations(str);
		String[] permutations2 = permutationsRecursive(str);
		System.out.println("Permutations using Iterative Method: " + Arrays.toString(permutations1));
		System.out.println("Permutations using Recursive Method: " + Arrays.toString(permutations2));
		System.out.println("Arrays are Equal: " + arraysEqual(permutations1, permutations2));
	}

	/**
	 * Iterative method to return all permutations of a String.
	 * 
	 * @param str-string.
	 * @return
	 */
	public static String[] findPermutations(String string) {

		if (string == null || string.length() == 0) {
			return null;
		}

		/**
		 * create an empty ArrayList to store partial permutations.
		 */
		List<String> temp = new ArrayList<>();
		temp.add(String.valueOf(string.charAt(0)));

		for (int i = 1; i < string.length(); i++) {
			for (int j = temp.size() - 1; j >= 0; j--) {
				String s = temp.remove(j);
				for (int k = 0; k <= s.length(); k++) {
					temp.add(s.substring(0, k) + string.charAt(i) + s.substring(k));
				}
			}
		}
		return temp.toArray(new String[0]);
	}

	/**
	 * Recursive method to return all permutations of a String.
	 * 
	 * @param str-string.
	 * @return
	 */
	public static String[] permutationsRecursive(String string) {

		List<String> permutations = new ArrayList<>();

		if (string == null || string.length() == 0) {
			permutations.add("");
			return permutations.toArray(new String[0]);
		}

		char ch = string.charAt(0);
		String[] permutation = permutationsRecursive(string.substring(1));

		for (String perm : permutation) {
			for (int i = 0; i <= perm.length(); i++) {
				String newPermutations = perm.substring(0, i) + ch + perm.substring(i);
				permutations.add(newPermutations);
			}
		}
		return permutations.toArray(new String[0]);
	}

	/**
	 * To check if the arrays returned by the two string functions are equal or not.
	 */
	public static boolean arraysEqual(String[] array1, String[] array2) {
		return Arrays.equals(array1, array2);
	}

}
