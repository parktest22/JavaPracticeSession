package com.interviewpreps;

import java.util.Scanner;

//String reversal 

public class StringReversalTest {

	public static void main(String[] args) {
		int i;
		String s="Pineapple", rev="";

		System.out.println("Enter a string to reverse: ");
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();

		char ch[] =s.toCharArray();

		for(i=ch.length-1;i>=0;i--) {
			rev = rev +ch[i];	
		}

		System.out.println("Reversed String: "+rev);
		sc.close();
	}

}
