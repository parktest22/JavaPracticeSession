package com.interviewpreps;

import java.util.Scanner;

public class FactorialTest {

	//Factorial of a number

	public static void main(String[] args) {

		int i,num=5,fact=1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter factorial number: ");
		num = sc.nextInt();

		for(i=1;i<=num;i++) {
			fact = fact *i;
		}

		System.out.println("Factorial of number: "+fact);
		sc.close();

	}
}
