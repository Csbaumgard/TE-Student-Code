package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		//LinkedHashMap == preserves order

		Map<String, String> namesToZips = new HashMap<>();
		namesToZips.put("Colton", "15301");
		namesToZips.put("Lylah", "15022");
		namesToZips.put("Tyler", "15332");

		for (String key : namesToZips.keySet()) {
			System.out.println("Key: " + key + " Value: " + namesToZips.get(key));
		}
		namesToZips.put("dan", "15308");
		if (namesToZips.containsKey("dan")) {
			System.out.println("Dan exists in the map!");
		}
		for (Map.Entry<String, String> kvPair : namesToZips.entrySet()) {
			System.out.println("Key: " + kvPair.getKey() + ", Value: " + kvPair.getValue());
		}
	}

	public static boolean collectionHasDuplicates(int[] numbers) {
		Set<Integer> numberSet = new HashSet<>();
		for (int n : numbers) {
			if (numberSet.contains(n)) {
				return true;
			}
			numberSet.add(n);
		}
		return false;
	}
}

