package com.kodnest.assignment.LogicalOperator;

import java.util.Scanner;


public class LogicalOperation {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Is Input Valid(true/false)");
	boolean operator1 = scan.nextBoolean();
	System.out.println("Does input meet a certain condition(true/false)");
	boolean operator = scan.nextBoolean();
	scan.close();
	LogicalOperationApp logicalOperatorValidatorApp = new LogicalOperationApp();
	logicalOperatorValidatorApp.isValidInput(operator);
	return;

}
	
}
