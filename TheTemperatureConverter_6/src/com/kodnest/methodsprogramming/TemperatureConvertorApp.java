package com.kodnest.methodsprogramming;

import java.util.Scanner;

public class TemperatureConvertorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter temperature in fahrenheit");
		double fahrenheit= scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		double celsius=temperatureConverter.convertFahrenheitToCelsius(fahrenheit);
		System.out.println("The temperature in celsius is " +celsius);
		

	}

}
