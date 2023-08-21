package com.kodnest.assignment.TemperatureConverter;
import java.util.Scanner;
public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome To the Temperature Conversion Tool");
		System.out.println("Select an option");
		int input = scan.nextInt();
		if (input == 1)
		{
			System.out.println("1.Convert Celsius to Fahreinheit");
		}
		else
		{
			System.out.println("2.Convert Farheinheit to Celsius");
		}
		System.out.println("Enter the temperature");
		double celsius = scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		double temperature = temperatureConverter.convertCelsiusToFahreinheit(celsius);
		System.out.println(temperature);
		double fahrenheit = scan.nextDouble();
		TemperatureConverter temperatureConverter1 = new TemperatureConverter();
		double temperature1 = temperatureConverter1.convertFahreinheitToCelsius(fahrenheit);
		System.out.println(temperature1);
		scan.close();
		

	}

	private double convertCelsiusToFahreinheit(double celsius) {
		double fahrenheit = (celsius*9/5)+32;
		return fahrenheit;
	}
	private double convertFahreinheitToCelsius(double fahrenheit)
	{
		
			double celsius = (fahrenheit-32)*5/9;
			return celsius;
		}
	}

	


