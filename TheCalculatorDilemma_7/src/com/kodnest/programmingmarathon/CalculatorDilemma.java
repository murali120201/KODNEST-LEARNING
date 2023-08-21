	package com.kodnest.programmingmarathon;
	
	import java.util.Scanner;
	
	public class CalculatorDilemma {
	
		public static void main(String[] args) {
			Scanner scan= new Scanner(System.in);
			System.out.println("Enter a number between 1-5");
			int num=scan.nextInt();
			switch(num)
			{
			case 1:
				System.out.println("Enter the two numbers to be added");
				int n1=scan.nextInt();
				int n2=scan.nextInt();
				System.out.println(n1+n2);
				break;
			case 2:
				System.out.println("Enter the two numbers to be subtracted");
				int n3=scan.nextInt();
				int n4=scan.nextInt();
				System.out.println(n3-n4);
				break;
			case 3:
				System.out.println("Enter the two numbers to be multiplied");
				int n5=scan.nextInt();
				int n6=scan.nextInt();
				System.out.println(n5*n6);
				break;
			case 4:
				System.out.println("Enter the two numbers to be divided");
				int n7=scan.nextInt();
				int n8=scan.nextInt();
				System.out.println(n7/n8);
				break;
			case 5:
				System.out.println("Enter the two numbers to find the remainder");
				int n9=scan.nextInt();
				int n10=scan.nextInt();
				System.out.println(n9%n10);
				break;
				default:
					System.out.println("Enter a number between 1-5");
				}
			
			}
		}
	
