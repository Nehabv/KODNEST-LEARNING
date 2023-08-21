package com.kodnest.assignment.ArithmeticCalculator;
import java.util.Scanner;
public class ArithmeticCalculator {
	public static void main(String[] args) {
		
		char operator;
		Double num1,num2,res;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose an operator: +,-,*,/,%");
		operator = scan.next().charAt(0);
		System.out.println("Enter the first number");
	    num1 = scan.nextDouble();
		System.out.println("Enter the second number");
	    num2 = scan.nextDouble();
	    scan.close();
		switch(operator) {
		case '+':
			res = num1+num2;
			System.out.println(num1+ "+" +num2+ "=" +res);
			break;
		case '-':
			res = num1+num2;
			System.out.println(num1+ "-" +num2+ "=" +res);
			break;
		case '*':
			res = num1+num2;
			System.out.println(num1+ "*" +num2+ "=" +res);
			break;
		case '/':
			res = num1+num2;
			System.out.println(num1+ "/" +num2+ "=" +res);
			break;
		case '%':
			res = num1+num2;
			System.out.println(num1+ "%" +num2+ "=" +res);
			break;
			
		
		}
	}
}