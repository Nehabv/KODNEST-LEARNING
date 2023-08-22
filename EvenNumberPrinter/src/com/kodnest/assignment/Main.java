package com.kodnest.assignment;
import java.util.Scanner;
public class Main {	
	public static void printEvenNumber(int n) {
		for(int i=2;i<=n;i+=2)
		{
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scan.nextInt();
		printEvenNumber(n);
		scan.close();
	}
}
