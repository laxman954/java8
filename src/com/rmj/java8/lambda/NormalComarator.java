package com.rmj.java8.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NormalComarator {
	public static void main(String[] args) {
		List<Scientist> employees = SampleDatas.getEmployee();
		employees.forEach(System.out::print);

		Collections.sort(employees, new Comparator<Scientist>() {
			@Override
			public int compare(Scientist o1, Scientist o2) {
				return o1.getCode() - o2.getCode();
			}
		});

		System.out.println();
		employees.forEach(System.out::print);

	}
}
