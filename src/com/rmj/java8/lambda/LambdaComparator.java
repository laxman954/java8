package com.rmj.java8.lambda;

import java.util.Comparator;
import java.util.List;

public class LambdaComparator {

	public static void main(String[] args) {
		List<Scientist> employees = SampleDatas.getEmployee();
		employees.forEach(System.out::print);
		// Compare using Code
		Comparator<Scientist> empComparator = (e1, e2) -> e1.getCode() - e2.getCode();
		// Print in Normal order
		employees.sort(empComparator);
		System.out.println();
		employees.forEach((employee) -> System.out.print(employee));
		// Print in Reverse Order
		employees.sort(empComparator.reversed());
		System.out.println();
		employees.forEach((employee) -> System.out.print(employee));

	}

}
