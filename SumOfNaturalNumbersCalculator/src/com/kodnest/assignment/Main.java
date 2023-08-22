package com.kodnest.assignment;
import java.util.Scanner;
public class Main {
	public static void calculateSum(int n ) {
		int sum = 0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		calculateSum( n );
		scan.close();
	}
}
