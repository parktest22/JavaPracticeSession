package com.fundamentals;

public class Person {

	public void PersonProperties() {
		String Name, Address, totalAsset, hairColor, eyeColor;
		int Height, Age;
	}

	public void Walking() {
		System.out.println("Person is Walking");
	}

	public void Sleeping() {
		System.out.println("Person is Sleeping");
	}

	public void Playing() {
		System.out.println("Person is Playing");
	}

	public static void main(String []args) {
		Person P = new Person();
		P.Walking();
		P.Sleeping();
		P.Playing();
	}

}
