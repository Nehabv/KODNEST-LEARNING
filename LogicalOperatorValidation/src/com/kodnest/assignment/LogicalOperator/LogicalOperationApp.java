package com.kodnest.assignment.LogicalOperator;

public class LogicalOperationApp {

	
		public boolean isValidInput(boolean operator) {

			 if(operator == true && operator == true)
			{
				System.out.println("input is valid");
			}
			else if(operator == true && operator == false)
			{
				System.out.println("input is invalid");
			}
			else if(operator == false && operator == true)
			{
				System.out.println("input is invalid");
			}
			else if(operator == false && operator == false)
			{
				System.out.println("input is invalid");
			}
			return operator;
		

	}
}

	
	
