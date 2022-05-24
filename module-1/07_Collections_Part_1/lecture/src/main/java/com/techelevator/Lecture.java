package com.techelevator;

import java.util.*;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		List<String> names = new ArrayList<>();
		names.add("Colton");
		names.add("Lylah");
		names.add("Twinkle");
		names.add("Deacon");
		names.add("Jeff");

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		names.add("Jeff");

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		names.add(1, "Tyler");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		names.remove(6);
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		if (names.contains("Tyler")) {
			// return true;
		}

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int indexOfTyler = names.indexOf("Tyler");
		System.out.println(indexOfTyler);

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		// create an array that is the same size as my list
		String[] namesArray = new String[names.size()];
		// iterate over the list
		for (int i = 0; i < names.size(); i++) {
		// copy from corresponding element
			namesArray[i] = names.get(i);
		}
		String[] namesArrayVTwo = names.toArray(namesArray);

		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		Collections.sort(names);
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		Collections.reverse(names);
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		for (int i = names.size() - 1; i >= 0; i--) {
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("FOREACH");
		System.out.println("####################");

		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("####################");
		System.out.println("PRIMITIVE WRAPPERS");
		System.out.println("####################");

		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(5);
		numbers.add(10);
		numbers.add(20);

		Integer numberAtIndex2 = numbers.get(2);

		for (int number : numbers) {
			System.out.println(number);
		}

		System.out.println("####################");
		System.out.println("STACKS AND QUEUES");
		System.out.println("####################");

		Queue<String> nextForCoffee = new LinkedList<>();

		nextForCoffee.offer("Colton");
		nextForCoffee.offer("Lylah");
		nextForCoffee.offer("Twinkle");

		while (!nextForCoffee.isEmpty()) {
			String nextUp = nextForCoffee.poll();
			System.out.println("Here is your coffee, " + nextUp);
		}

		Stack<String> lorem = new Stack<>();
		lorem.push("Colton");
		lorem.push("Lylah");
		lorem.push("Twinkle");

		while (!lorem.isEmpty()) {
			String next = lorem.pop();
			System.out.println("Here you go, " + next);
			
		}
	}
}
