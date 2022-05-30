package pratice.java;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
	       Scanner input = new Scanner(System.in);
			System.out.println("Enter the principal:");
			double principal = input.nextDouble();
			
			
			System.out.println("Enter the rate:");
			double rate = input.nextDouble();
			
			System.out.println("Enter the time:");
			double time = input.nextDouble();
			
			System.out.println("Enter number of time interest compounded: ");
			double number = input.nextDouble();
			
			double interest = (principal * (Math.pow((1 + rate/100), (time * number)))-principal);
			System.out.println("principal: " + principal);
			System.out.println("Interest rate: " + rate);
			System.out.println("Time Duration: " + time);
			System.out.println("Number of Time interest compounded: " + number);
			System.out.println("Compound Interest: " + interest);
			
			input.close(); }
	

				
				
				
				// TODO Auto-generated method stub

	}


