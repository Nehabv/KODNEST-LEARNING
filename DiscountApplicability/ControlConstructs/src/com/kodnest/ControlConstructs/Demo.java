package com.kodnest.ControlConstructs;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int marks = scan.nextInt();
		System.out.println("Welcome to Kodnest");
		Check check = new Check();
		check.CheckEligibility(marks);
		scan.close();		
	}

}
