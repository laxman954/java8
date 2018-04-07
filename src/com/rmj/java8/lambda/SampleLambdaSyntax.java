package com.rmj.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SampleLambdaSyntax {

	public static void main(String[] args) {
		String[] names = { "lekshmana", "mahesh", "amit" };
		List<String> nameList = Arrays.asList(names);

		// Using For loop
		System.out.println("Using For Loop");
		for (String name : nameList) {
			System.out.print(name);
		}

		System.out.println("\nUsing Lambda");
		nameList.forEach((name) -> System.out.print(name + ","));
		System.out.println("\nUsing ::");
		nameList.forEach(System.out::print);

		// Sorting
		Arrays.sort(names);
		// Sorting using Comparator and based on length
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});

		// Using lambda
		Arrays.sort(names, (String s1, String s2) -> (s1.length() - s2.length()));

		// Using lambda agaain
		Comparator<String> strComparator = (s1, s2) -> s1.length() - s2.length();
		Arrays.sort(names, strComparator);
	}

}
