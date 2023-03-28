package com.assignments;

import java.util.Scanner;

public class PatternMatchTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines you want to print");
		int n = sc.nextInt();
		print(n);
	}

	private static void print(int n) {
		// TODO Auto-generated method stub
		int x=1;
		for(int i =1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(x+"  ");
				x++;
			}
			System.out.println();

		}
		
	}
		
	

}
