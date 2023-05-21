package programs_Algorithm;

import java.util.*;

public class UC9Algorithm {

	static Scanner cs = new Scanner(System.in);

	/**
	 * This method is created to guess the number that user is thinking of.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Guess a number between 0 to 100 ");
		cs.next();
		{
			System.out.println("Guessed number is " + guess());
			System.out.println("------------------------");
		}
	}

	/**
	 * To find the number that user thinking of.
	 * 
	 * @return
	 */
	static int guess() {

		int low = 0, high = 100, mid;
		while (low != high) {
			mid = (low + high) / 2;
			System.out.println("Enter 1 if number is between " + low + " - " + mid);
			System.out.println("Enter 2 if number is between " + (mid + 1) + " - " + high);

			int c = cs.nextInt();
			mid = (low + high) / 2;
			if (c == 1)
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}

}
