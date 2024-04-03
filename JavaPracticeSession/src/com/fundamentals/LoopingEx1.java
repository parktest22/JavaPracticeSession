package com.fundamentals;

public class LoopingEx1 {

	public static void main(String[] args) {

		//For Each loop
		//Collections 
		int[] numbers  = {10,20,30,40,50,60};
		System.out.println("Length is "+numbers.length);

		//For Each loop
		for(int num: numbers) {
			System.out.println(num);
		}
	}

}
