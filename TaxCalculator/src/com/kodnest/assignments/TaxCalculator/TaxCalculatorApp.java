package com.kodnest.assignments.TaxCalculator;

import java.util.Scanner;

public class TaxCalculatorApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter PurcahseAmount");
		double purchaseAmt = scan.nextDouble();
		System.out.println("Enter the tax Rate");
		double taxRate = scan.nextDouble();
		TaxCalculatorApp taxcalculatorapp= new TaxCalculatorApp();
		double tax = taxcalculatorapp.calculateTotalWithTax(purchaseAmt,taxRate);
		System.out.println("Total cost including Tax:" +tax);
		scan.close();
	}


	public double calculateTotalWithTax(double purchaseAmt, double taxRate)
	{
		
		return purchaseAmt*taxRate;

	
	}
}
	