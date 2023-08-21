package com.kodnest.programmingmarathon;

import java.util.Scanner;

public class BitwiseSwapper {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first Integer");
		int first=scan.nextInt();
		System.out.println("Enter the second Integer");
		int second=scan.nextInt();
		swapUsingBitwise(first, second);
		System.out.println("After swapping: First="+second+" Second="+first);
		
	}	
	public static void swapUsingBitwise(int a,int b) {
		a=a^b;
		b=b^a;
	}
}
