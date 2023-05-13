package programs_Algorithm;

import java.util.*;

public class UC7Algorithm {

	/**
	 * This method is created to find the Prime number.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i, count;

		/**
		 * 1)Taking input from user.
		 */

		System.out.print("Enter n value : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Prime numbers between 1 to " + num + " are ");

		/**
		 * Finding the prime number.
		 */

		for (int p = 2; p <= num; p++) {
			count = 0;
			for (i = 1; i <= p; i++) {
				if (p % i == 0) {
					count++;
				}
			}
			if (count == 2)
				System.out.print(p + "  ");
		}

		sc.close();
	}

}
