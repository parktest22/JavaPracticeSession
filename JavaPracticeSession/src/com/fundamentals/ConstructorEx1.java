package com.fundamentals;

//Constructor Example

public class ConstructorEx1 {

	public ConstructorEx1() {
		System.out.println("Constructor initialized when class object is created");
	}

	public ConstructorEx1(String name) {
		System.out.println("Constructor initialized :"+name);
	}


	public static void main(String[] args) {

		ConstructorEx1 obj1 = new ConstructorEx1();
		ConstructorEx1 obj2 = new ConstructorEx1("SingleParam");

	}

}
