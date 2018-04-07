package com.rmj.java8.lambda;

public class Scientist {
	private String name;
	private int code;

	private int salary;
	private String lastName;

	public Scientist(String name, int code) {
		super();
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", code=" + code + "]";
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Scientist(String name, int code, int salary, String lastName) {
		super();
		this.name = name;
		this.code = code;
		this.salary = salary;
		this.lastName = lastName;
	}

}
