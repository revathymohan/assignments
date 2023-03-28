package com.assignments;

import java.util.Scanner;

public class PatternRightAngle {
	
	/**
	 * 
	 * 1
	 * 1 2
	 * 1 2 3
	 * 1 2 3 4
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines you want to print");
		int n = sc.nextInt();
		print(n);

	}

	private static void print(int n) {
		// TODO Auto-generated method stub
		
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();

		}
		
	}

}
