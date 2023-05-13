package programs_Algorithm;

import java.util.Scanner;

public class UC4Algorithm<T> {

	/**
	 * This method is created to print the sorted list of integers using bubble
	 * sort.
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
		System.out.print("List of integers before sorting are:");
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + " ");
		}
		bubbleSort(arrays);
		printLinkedList(arrays);
		cs.close();
	}

	/*
	 * bubbleSort for an array
	 */
	public static <T extends Comparable<T>> T[] bubbleSort(T[] arrays) {
		int n = arrays.length;
		T temp = null;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arrays[j - 1].compareTo(arrays[j]) > 0) {
					/*
					 * swap elements
					 */
					temp = (T) arrays[j - 1];
					arrays[j - 1] = arrays[j];
					arrays[j] = temp;
				}
			}
		}
		return arrays;
	}

	/**
	 * Print the sorted list of integers
	 */
	public static void printLinkedList(String[] arrays) {
		System.out.print("\nSorted List of Integers:");
		for (String array : arrays) {
			System.out.print(array + " ");
		}
	}

}
