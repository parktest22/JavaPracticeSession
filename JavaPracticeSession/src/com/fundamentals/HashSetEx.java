package com.fundamentals;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {

		Set<Integer> se = new HashSet<Integer>();

		se.add(10);
		se.add(20);
		se.add(10);

		Iterator it = se.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
