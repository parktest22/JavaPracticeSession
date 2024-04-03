package com.fundamentals;

import java.util.ArrayList;
import java.util.Iterator;

//ArrayListEx 

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<String> li = new ArrayList<String>(); //Creating ArrayList
		li.add("January");
		li.add("February");
		li.add("March");
		li.add("April");
		li.add("February");

		for(int i=0;i<li.size();i++)
		{
			System.out.println("Value of li at "+i+" is : "+li.get(i));
		}

		Iterator it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
