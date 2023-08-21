package com.kodnest.methodsprogramming;

import java.util.Scanner;

public class JourneyCalculatorApp {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the speed and time to be calculated");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculator journeyCalculator= new JourneyCalculator();
		System.out.println(journeyCalculator.calculateDistance(speed, time));

	}

}
