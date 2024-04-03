package com.interviewpreps;

import java.util.Scanner;

public class FibonnacciTest {

	//Fibonnacci Numbers 

	public static void main(String[] args) {

		int first=0, second=1, third=0, num=5;

		System.out.print("How many Fibonnacci numbers to list: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		System.out.print("fibonacci series: "+first);
		System.out.print(","+second);

		for(int i=2;i<=num;i++) {
			third = first+second;
			System.out.print(","+third);
			first = second;
			second = third;

		}

		sc.close();
	}

}
