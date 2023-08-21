package com.kodnest.assignment.calculate;
import java.util.Scanner;
public class JouneyCalculator {
	public static void main (String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Speed and time to calculate distance travelled");
		double speed = scan.nextDouble();
		double time = scan.nextDouble();
		JouneyCalculator journeyCalculator = new JouneyCalculator();
		double distance = journeyCalculator.calculateDistance(speed,time);
		System.out.println(distance);
	}

	private double calculateDistance(double speed, double time) {
		// TODO Auto-generated method stub
		return 0;
	}


}
