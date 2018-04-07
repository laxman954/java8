package com.rmj.java8.lambda;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<Scientist> math = SampleDatas.getEmployee_M();
		List<Scientist> scie = SampleDatas.getEmployee_S();

		System.out.println("Show all names ");
		math.forEach((m) -> System.out.printf("%s %s ,%s,", m.getName(), m.getLastName(), m.getSalary()));
		System.out.println();
		scie.forEach((s) -> System.out.printf("%s %s ,%s,", s.getName(), s.getLastName(), s.getSalary()));

		System.out.println("\nIncrease salary by 100");
		Consumer<Scientist> giveRise = (s) -> s.setSalary((s.getSalary() + 100) + s.getSalary());
		math.forEach(giveRise);
		scie.forEach(giveRise);

		math.forEach((m) -> System.out.printf("%s %s ,%s,", m.getName(), m.getLastName(), m.getSalary()));
		System.out.println();
		scie.forEach((s) -> System.out.printf("%s %s ,%s,", s.getName(), s.getLastName(), s.getSalary()));

		System.out.println("\nShow scientist earn more than 5000");
		math.stream().filter((m) -> m.getSalary() > 5000)
				.forEach((m) -> System.out.printf("%s %s ,%s,", m.getName(), m.getLastName(), m.getSalary()));

		System.out.println("\nReuse the filter- salary < 4000 and name starts 'P'");
		Predicate<Scientist> salaryFilter = (m) -> m.getSalary() < 4000;
		Predicate<Scientist> nameFilter = (m) -> m.getName().startsWith("P");
		math.stream().filter(nameFilter).filter(salaryFilter)
				.forEach((m) -> System.out.printf("%s %s ,%s,", m.getName(), m.getLastName(), m.getSalary()));

		System.out.println("\nLimit the results to 2");
		math.stream().limit(2)
				.forEach((m) -> System.out.printf("%s %s ,%s,", m.getName(), m.getLastName(), m.getSalary()));

		System.out.println("\n Limit to 2 and sort by name");
		math.stream().sorted((s1, s2) -> s1.getName().compareTo(s2.getName())).limit(2)
				.forEach((m) -> System.out.printf("%s %s ,%s,", m.getName(), m.getLastName(), m.getSalary()));

		System.out.println("\nGet Lowest Salry Math sci");
		Scientist minSalSci = math.stream().min((s1, s2) -> s1.getSalary() - s2.getSalary()).get();
		System.out.printf("%s %s ,%s,", minSalSci.getName(), minSalSci.getLastName(), minSalSci.getSalary());

		System.out.println("\nGet highest Salry Math sci");
		Scientist maxSalSci = math.stream().max((s1, s2) -> s1.getSalary() - s2.getSalary()).get();
		System.out.printf("%s %s ,%s,", maxSalSci.getName(), maxSalSci.getLastName(), maxSalSci.getSalary());

		System.out.println("\nCollect Salary < 4000 to list");
		List<Scientist> salryMore = math.stream().filter(salaryFilter).collect(Collectors.toList());
		salryMore.forEach((m) -> System.out.printf("%s %s ,%s,", m.getName(), m.getLastName(), m.getSalary()));

		System.out.println("\nReturn First name of all math scientis");
		String name = math.stream().map(Scientist::getName).collect(Collectors.joining(","));
		System.out.println(name);

		System.out.println("\nParralel Stream , Total Math Salary");
		int salary = math.parallelStream().mapToInt(m -> m.getSalary()).sum();
		System.out.println(salary);

		System.out.println("\nSummary Statistics");
		IntSummaryStatistics stats = math.stream().mapToInt(m -> m.getSalary()).summaryStatistics();
		System.out.println("Max Salary " + stats.getMax());
		System.out.println("Avg Salary " + stats.getAverage());
		System.out.println("Min Salary " + stats.getMin());
		System.out.println("Total Salary " + stats.getSum());
		System.out.println("Count " + stats.getCount());

	}

}
