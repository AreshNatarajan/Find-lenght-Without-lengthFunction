package org.practice;

public class CoutStringLength {

	public static void main(String[] args) {
		String name = "Areshkumar";
		
		char[] letter = name.toCharArray();
		
		System.out.println(letter);
		
		int count = 0;
		
		for(char dataOfArray : letter) {
			count++;
		}
		System.out.println(count);
		
	}

}
