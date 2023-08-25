package com.kodnest.assignment;
public class Main {
	public static void printFibonacciSeries(int n) {
		int n1 = 0, n2 = 1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(n1+" ");
			int n3 = n1+n2;
			n1 = n2;
			n2 = n3; 
		}
		
	}
	public static void main(String[] args) {
		printFibonacciSeries(10);
	}

}
