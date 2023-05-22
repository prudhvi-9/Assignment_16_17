package programs_Algorithm;
import java.util.ArrayList;

public class UC8Algorithm {
		/**
		 * To count the characters in a string .
		 *
		 */
		public static int[] count(String str) {

			int[] count = new int[1000];
			for (int i = 0; i < str.length(); i++) {
				count[str.charAt(i)]++;
			}
			return count;

		}

		/**
		 * To count the integer .
		 *
		 */
		public static int[] count(int n) {
			int[] count = new int[10];
			int temp = n;
			while (temp != 0) {
				int r = temp % 10;
				count[r]++;
				temp = temp / 10;
			}
			return count;
		}

		/**
		 * To check the two strings are anagrams or not.
		 * 
		 */
		public static boolean anagram(String s1, String s2) {
			if (s1.length() != s2.length()) {
				return false;
			}
			int[] s1count = count(s1);
			int[] s2count = count(s2);
			for (int i = 0; i < s2count.length; i++) {
				if (s2count[i] != s1count[i]) {
					return false;
				}
			}
			return true;
		}

		/**
		 * To print the prime no between to 1 to 1000
		 */
		public static void prime() {

			boolean check;
			for (int j = 2; j <= 1000; j++) {
				check = true;
				for (int i = 2; i < j / 2; i++) {
					if (j % i == 0) {
						check = false;
						break;
					}
				}
				if (check)
					System.out.print(j + " ");
			}
		}

		/**
		 * To check if given number is prime or not.
		 * 
		 */
		public static boolean isPrime(int n) {
			for (int i = 2; i < n / 2; i++) {
				if (i % n == 0) {
					return false;
				}
			}
			return true;
		}

		/**
		 * Function to find the is pallindrome or not.
		 * 
		 * 
		 */
		public static boolean isPallindrome(int n) {
			int temp = n;
			int sum = 0;
			while (temp != 0) {
				int r = temp % 10;
				sum = sum * 10 + r;
				temp = temp / 10;
			}
			if (sum == n) {
				return true;
			}
			return false;
		}

		/**
		 * To check if prime is pallindrome and print it.
		 */
		public static void primePallindrome() {

			boolean check;
			for (int j = 2; j <= 1000; j++) {
				check = true;
				for (int i = 2; i < j / 2; i++) {
					if (j % i == 0) {
						check = false;
						break;
					}
				}
				if (check && isPallindrome(j))
					System.out.print(j + " ");
			}
		}

		/**
		 * Function to check if number is anagram or not.
		 */
		public static void primeAnagrams() {
			ArrayList<Integer> array = new ArrayList<Integer>();

			boolean check;
			for (int j = 2; j <= 1000; j++) {
				check = true;
				for (int i = 2; i < j / 2; i++) {
					if (j % i == 0) {
						check = false;
						break;
					}
				}
				if (check)
					array.add(j);
			}
			for (int i = 0; i < array.size(); i++) {
				for (int j = i + 1; j < array.size(); j++) {
					String strA = Integer.toString(array.get(i));
					String strB = Integer.toString(array.get(j));
					if (anagram(strA, strB)) {
						System.out.println(array.get(i) + "  " + array.get(j));
					}
				}
			}
		}

	}


