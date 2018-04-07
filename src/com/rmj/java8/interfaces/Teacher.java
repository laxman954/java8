package com.rmj.java8.interfaces;

public interface Teacher {
	
	static Teacher getInstance(){
		return new MultipleInherittance();
	}
	default void display(){
		System.out.println("Default Teacher");
	}

}
