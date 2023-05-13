package programs_Algorithm;

import java.util.Scanner;

public class UC5Algorithm<T> {

	/**
	 * This method is created to sort the list of Strings using merge sort.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		String[] array = new String[4];

		/*
		 * Taking input from the user.
		 */
		System.out.println("Enter Strings: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = cs.next();
		}
		mergeSort(array, 0, array.length - 1);
		System.out.println("Array is sorted using Merge Sort");
		for (String element : array) {
			System.out.print(element + ",");
		}
		cs.close();
	}

	/*
	 * Divided sub arrays is sorted and merged into a single array.
	 */
	public static <T extends Comparable<T>> void mergeSubArrays(String[] inputArr, int low, int middle, int high) {

		/*
		 * Two temporary sub arrays are created.
		 */
		int subArrayA = middle - low + 1;
		int subArrayB = high - middle;

		String[] temp1 = new String[subArrayA];
		String[] temp2 = new String[subArrayB];

		for (int i = 0; i < subArrayA; i++) {
			temp1[i] = inputArr[low + i];
		}
		for (int j = 0; j < subArrayB; j++) {
			temp2[j] = inputArr[middle + 1 + j];
		}
		int i = 0;
		int j = 0;
		/*
		 * Merging two temporary arrays
		 */
		while ((i < subArrayA) && (j < subArrayB)) {
			if (temp1[i].compareTo(temp2[j]) < 0) {
				inputArr[low] = temp1[i++];
			} else {
				inputArr[low] = temp2[j++];
			}
			low++;
		}

		while (i < subArrayA) {
			inputArr[low++] = temp1[i++];
		}
		while (j < subArrayB) {
			inputArr[low++] = temp2[j++];
		}
		return;
	}

	/*
	 * Merge Sorting.
	 */
	public static <T extends Comparable<T>> void mergeSort(String[] array, int low, int high) {

		if (low == high) {
			return;
		} else {
			/*
			 * Finding middle point for dividing the arrays into two sub arrays.
			 */
			int middle = (low + high) / 2;
			mergeSort(array, low, middle);
			mergeSort(array, middle + 1, high);
			/*
			 * Calling mergesubarrays method.
			 */
			mergeSubArrays(array, low, middle, high);
		}
	}

}
