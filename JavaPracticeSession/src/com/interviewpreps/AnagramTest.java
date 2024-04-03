package com.interviewpreps;

import java.util.Arrays;

public class AnagramTest {

		// Anagram

		public static void main(String[] args) {

			String S1="Hai", S2="Tea";
			boolean status=true;

			if(S1.length() != S2.length()) {
				System.out.println("Not a Anagram");
			} else {
				S1 = S1.replaceAll("\\s", "");
				S2 = S2.replaceAll("\\s", "");
				char c1[] = S1.toLowerCase().toCharArray();
				char c2[] = S2.toLowerCase().toCharArray();
				Arrays.sort(c1);
				Arrays.sort(c2);
				status = Arrays.equals(c1, c2);
			}

			if(status){
				System.out.println("Anagrams :"+S1+" and "+S2);
			}
			else {
				System.out.println("Not Anagrams :"+S1+" and "+S2);
			}
	}

}
