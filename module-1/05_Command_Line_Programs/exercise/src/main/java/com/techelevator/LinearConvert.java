package com.techelevator;
import java.util.Objects;
import java.util.Scanner;
public class LinearConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Linear Converter!");
		System.out.println("Please enter a length: ");
		String measurementInput = scanner.nextLine();
		System.out.println("Is the measurement in (m)eters, or (f)eet?: ");
		String measureUnits = scanner.nextLine();
		if (Objects.equals(measureUnits, "m")) {
			double stringToDouble = Double.parseDouble(measurementInput);
			double metersToFeet = stringToDouble * 0.3048;
			System.out.println(measurementInput + "m is " + metersToFeet + "f");
		} else if (Objects.equals(measureUnits, "f")) {
			double stringToDouble = Double.parseDouble(measurementInput);
			double feetToMeters = stringToDouble * 3.2808399;
			System.out.println(measurementInput + "f is " + feetToMeters + "m");
		}
	}
}
