package com.kodnest.assignment;
import java.util.Scanner;
public class Main {
	public static void printPrimes(int n) {
		for(int i=1;i<=n;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = scan.nextInt();
	printPrimes(n);
	scan.close();
	}

}
