package com.kodnest.assignment.BitwiseSwapper;
import java.util.Scanner;
public class BitwiseSwapperApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first Integer");
		int a = scan.nextInt();
		System.out.println("Enter the second Integer");
		int b = scan.nextInt();
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("After Swapping: First Integer = "+a+ " Second Integer: "+b);
		scan.close();
	} 

}
