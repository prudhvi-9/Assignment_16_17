package programs_Algorithm;

import java.util.*;

public class UC3Algorithm<T> {
	/**
	 * This method is created to print the sorted list of words using insertion
	 * sort."
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cs = new Scanner(System.in);
		String[] arrays = new String[5];
		/**
		 * Taking input from the user.
		 */
		System.out.println("Enter array elements :");
		for (int i = 0; i < arrays.length; i++) {
			arrays[i] = cs.next();
		}
		InsertionSort(arrays);
		cs.close();

	}

	/**
	 * To sort the list using insertion sort.
	 *
	 */
	public static <T extends Comparable<T>> void InsertionSort(T[] arrays) {
		/**
		 * Sorting the words.
		 */
		for (int i = 1; i < arrays.length; i++) {
			T temp = arrays[i];
			int j = i - 1;
			while (j >= 0 && arrays[j].compareTo(temp) > 0) {
				arrays[j + 1] = arrays[j];
				j--;
			}
			arrays[j + 1] = temp;
		}

		System.out.print("List of words before sorting are:");
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + " ");
		}
		System.out.print("\nSorted List of Words:");
		for (T array : arrays) {
			System.out.print(array + " ");

		}
	}
}
