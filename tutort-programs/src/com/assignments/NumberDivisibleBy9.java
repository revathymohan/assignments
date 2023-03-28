package com.assignments;

public class NumberDivisibleBy9 {
/*
 * write a program to find the numbers and sum of all integers btwn
 * 100 and 200 divisible by 9
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		for(int i=100;i<=200;i++) {
			if(i % 9 == 0) {
				System.out.print(i+" ");
				sum += i;
			}
			
		}
		System.out.println();
		System.out.println("The sum :"+sum);

	}

}
