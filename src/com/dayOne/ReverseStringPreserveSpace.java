package com.dayOne;

public class ReverseStringPreserveSpace {

	public static void main(String[] args) {
		// output = g ni r tsamaI
		String input = "I am a string";
		char[] ic = input.toCharArray();
		char[] rc = new char[ic.length];
		// Creating result array with spaces
		for (int i = 0; i < ic.length; i++) {
			if (ic[i] == ' ') {
				rc[i] = ic[i];
			}
		}

		int j = rc.length - 1;
		// Reversing the String
		for (int i = 0; i < ic.length; i++) {
			if (ic[i] != ' ') {
				// From reverse if there is any space, ignoring the index
				if (rc[j] == ' ') {
					j--;
				}
				rc[j] = ic[i];
				// Decrement for j index
				j--;
			}
		}
		System.out.println(String.valueOf(rc));
	}

}
