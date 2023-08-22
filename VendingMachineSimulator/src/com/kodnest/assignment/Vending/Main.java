package com.kodnest.assignment.Vending;
import java.util.Scanner;
public class Main {
	
	public static void getProduct(String productCode) {
		switch(productCode)
		{
		case "P00":
			System.out.println("Coca-Cola");
			break;
		case "P01":
		System.out.println("Pepsi");
			break;
		case "P02":
			System.out.println("Fanta");
			break;
		case "P03":
			System.out.println("Jaljeera");
			break;
		case "P04":
			System.out.println("MountainDew");
			break;
		case "P05":
			System.out.println("BoatGuava");
				break;
			default:
			System.out.println("Let the drink be panaka");
		}	
	}

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a code");
	String productCode = scan.next();
	getProduct(productCode);
	scan.close();
	}

}
