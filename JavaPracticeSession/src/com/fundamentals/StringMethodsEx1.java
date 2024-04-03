package com.fundamentals;

public class StringMethodsEx1 {

	public static void main(String[] args) {

		//ReplaceAll Method will allow with Regex
		String str = "Krish1234 Software5678 Solutions3456";
		str = str.replaceAll("\\d", "");
		System.out.println("After remove digits :"+str);

	}

}
