package programs_Algorithm;

public class MainUC8 {
	/**
	 * This method is created to find the prime numbers which are palindrome and
	 * anagrams.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Prime numbers between 0 to 1000:");
		UC8Algorithm.prime();
		System.out.println();
		System.out.println("\nNumbers which are prime,pallindrome are:");
		UC8Algorithm.primePallindrome();
		System.out.println();
		System.out.println("\nNumbers which are prime,anagrams are:");
		UC8Algorithm.primeAnagrams();
	}

}
