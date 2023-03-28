package com.assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 153;
		checkArmstrong(number);

	}

	private static void checkArmstrong(int number) {
		// TODO Auto-generated method stub
		
		int n= number;
		int sum =0;
		while(n>0) {
			int reminder = n%10;
			n = n/10;
			sum += (reminder*reminder*reminder);
			
			
		}
		if(sum == number)
		{
			System.out.println(number+" is an armstrong number");
		}
		else {
			System.out.println(number+" is not an armstrong number");

		}
	}

}
