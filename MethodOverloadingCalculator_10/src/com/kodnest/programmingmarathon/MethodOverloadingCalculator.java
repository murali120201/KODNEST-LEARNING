package com.kodnest.programmingmarathon;

import java.util.Scanner;

public class MethodOverloadingCalculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the two numbers and the operator of your choice");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		char opeartor=scan.next().charAt(0);
		System.out.println("Result is "+calculate(num1, num2, opeartor) );

	}
	public static int calculate(int num1, int num2, char operator) {
		switch(operator) {
		case '+':
			return num1+num2;
		case '-':
			return num1-num2;
		case '*':
			return num1*num2;
		case'/':
			return num1/num2;
		
			default:
			System.out.println("Invalid operator");
			
		
		
			
			
			
			
		}
		return operator;
	
	}

}
