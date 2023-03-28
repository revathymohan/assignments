package com.assignments;

public class PrimeNumberSum {
	/**
	 * Check if a number can be expressed as a sum of 2 prime numbers
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 16;
		findPrimes(number);

	}

	private static void findPrimes(int number) {
		// TODO Auto-generated method stub
//boolean[] visited = new boolean[number];
		for (int i = 2; i < number / 2; i++) {
			boolean isPrime = checkprime(i);
			if (isPrime) {
				int remaining = number - i;
				isPrime = checkprime(remaining);

				if (isPrime) {
					System.out.println("Is prime sum --- " + i + " " + remaining);
				}
			}
		}

	}

	private static boolean checkprime(int i) {

		// TODO Auto-generated method stub
		// if(!visited[i]) {
		if (i == 2) {
			// visited[i]= true;
			return true;
		}
		for (int k = 2; k < i; k++) {
			if (i % k == 0) {
				return false;
			}
		}
		// visited[i]= true;

		return true;
		// }

	}

}
