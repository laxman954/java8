package com.rmj.java8.interfaces;

public class MultipleInherittance implements Student,Teacher{

	@Override
	public void display() {
		Student.super.display();
	}
	
	public static void main(String args[]){
		Teacher.getInstance().display();
	}

}
