package com.kodnest.assignment.TempConverter;
import java.util.Scanner;
public class TemperatureConverterApp {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter temperature to convert fahrenheit to celsius");
	double fahrenheit = scan.nextDouble();
	TemperatureConverter temperatureConverter = new TemperatureConverter();
	double temperature = temperatureConverter.convertFahrenheitToCelsius(fahrenheit);
	System.out.println(temperature);
	scan.close();
	

	}

}
