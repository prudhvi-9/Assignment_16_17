package programs_Algorithm;

import java.util.Arrays;

public class UC2Algorithm {

	/**
	 * This method is created to find the word from the word list.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String array[] = { "hari", "saikiran", "ravi", "shiva" };
		String x = "saikiran";
		int result = binarySearch(array, x);

		if (result >= 0) {
			System.out.println("Element found at " + "index " + result);
		} else {
			System.out.println("Element not found");

		}
	}

	/**
	 * To search for the element present in list.
	 * 
	 * @param array-array which contains words.
	 * @param x-the       word to be searched. @return-returns.
	 */
	static int binarySearch(String[] array, String x) {

		int low = 0, high = array.length - 1;
		Arrays.sort(array);
		while (low <= high) {
			int m = low + (high - low) / 2;
			int comp = x.compareTo(array[m]);

			/**
			 * Check if comp is present at mid or not.
			 */
			if (comp == 0) {
				return m;
			}
			/**
			 * If comp greater then ignore left half.
			 */
			if (comp > 0) {
				low = m + 1;
			}

			/**
			 * If comp is smaller then ignore right half.
			 */
			else {
				high = m - 1;
			}

		}
		return -1;

	}

}
