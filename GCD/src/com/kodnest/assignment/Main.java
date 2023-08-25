package com.kodnest.assignment;
import java.util.Scanner;
public class Main {	
	public static void findGCD(int a,int b) {
		int gcd = 0;
		while(b!=0)
		{
			int temp = b;
			b = a%b;
			a=temp;	
		}
		gcd = a;
		System.out.print(gcd+" ");	
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		findGCD(a,b);
		scan.close();
	}
}
