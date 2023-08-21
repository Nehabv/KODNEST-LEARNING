package com.kodnest.practise.CharacterIdentifier;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = scan.next().charAt(0);
		identifyCharacter(ch);
		scan.close();	
}
	public static void identifyCharacter(char ch)
	{
		if (Character.isLowerCase(ch)) {
            if ("aeiou".contains(String.valueOf(ch)))
            {
            	System.out.println("lower-case vowel");
            } else
            {
            	System.out.println("lower-case consonant");
            }
        } 
		else if (Character.isUpperCase(ch)) {
            if ("AEIOU".contains(String.valueOf(ch)))
            {
            	System.out.println("upper-case vowel");      
            } else
            {
            	System.out.println("upper-case vowel");
            }
        } 
		else if (Character.isDigit(ch))
        {
        	System.out.println("digit");
        } else 
        {
        	System.out.println("special character");
        }
    }
}







	



