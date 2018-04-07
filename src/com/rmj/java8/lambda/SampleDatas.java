package com.rmj.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class SampleDatas {

	public static List<Scientist> getEmployee() {
		List<Scientist> employee = new ArrayList<>();
		employee.add(new Scientist("Rmj", 2));
		employee.add(new Scientist("Pascal", 1));
		employee.add(new Scientist("Pluto", 3));

		return employee;
	}

	public static List<Scientist> getEmployee_M() {
		List<Scientist> employee = new ArrayList<>();
		employee.add(new Scientist("Rmj", 2, 1500, "chennai"));
		employee.add(new Scientist("Pascal", 1, 3000, "Us"));
		employee.add(new Scientist("Pluto", 3, 500, "India"));
		return employee;
	}

	public static List<Scientist> getEmployee_S() {
		List<Scientist> employee = new ArrayList<>();
		employee.add(new Scientist("Guri", 2, 1500, "chennai"));
		employee.add(new Scientist("Stehpan", 1, 3000, "Us"));
		employee.add(new Scientist("Charles", 3, 500, "India"));
		return employee;
	}

}
