package com.techelevator;

import java.util.Objects;
import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Temperature Converter!");
		System.out.println("Please enter a temperature: ");
		String temperatureInput = scanner.nextLine();
		System.out.println("Is the temperature in (f)ahrenheit, or (c)elcius?: ");
		String tempUnits = scanner.nextLine();
		if (Objects.equals(tempUnits, "f")) {
			double stringToDouble = Double.parseDouble(temperatureInput);
			double fahrenheitToCelcius = (stringToDouble - 32) / 1.8;
			System.out.println(temperatureInput + "f is " + fahrenheitToCelcius + "c");
		} else if (Objects.equals(tempUnits, "c")) {
			double stringToDouble = Double.parseDouble(temperatureInput);
			double celciusToFahrenheit = (stringToDouble * 1.8) + 32;
			System.out.println(temperatureInput + "c is " + celciusToFahrenheit + "f");
		}
	}
}
