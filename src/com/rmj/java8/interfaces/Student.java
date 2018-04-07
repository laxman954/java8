package com.rmj.java8.interfaces;

public interface Student {
	default void display(){
		System.out.println("Default Student");
	}
}
