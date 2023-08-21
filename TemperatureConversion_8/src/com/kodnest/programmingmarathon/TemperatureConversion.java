package com.kodnest.programmingmarathon;
		
import java.util.Scanner;
			
public class TemperatureConversion {
			
	public static void main(String[] args) {
		System.out.println("Welcome To The Temperature Conversion Tool..!");
		System.out.println("Select an option");
		System.out.println("1. Convert Celsius to Fahrenheit");
		System.out.println("2. Convert Fahrenheit to Celsius");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice");
		int num=scan.nextInt();
		switch(num) {
			case 1:
				System.out.println("Enter The Temperature To Be Converted into Fahernheit");
				double n1=scan.nextDouble();
				System.out.println(celsiusToFahrenheit(n1));
				break;
				case 2:
				System.out.println("Enter The Temperature To Be Converted into Celsius");
				double n2=scan.nextDouble();
				System.out.println(fahrenheitToCelsius(n2));
				break;
				default:
				System.out.println("Enter your choice");
					}
				}
	public static double celsiusToFahrenheit(double celsius) {
					return celsius*9/5+32;
					
		}
	public static double fahrenheitToCelsius(double fahrenheit) {
					return(fahrenheit-32)*5/9;
				}
			
			}
