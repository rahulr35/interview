package com.dayOne;

import java.util.LinkedList;
import java.util.List;

public class SumOfTen {

	public static void main(String[] args) {

		int [] a = {4, 5, 4, 6, 5, 3, 7, 9};
		List<String> output = new LinkedList<>();
		for (int i = 0; i < a.length; i++) {
			 for ( int j = i+1; j < a.length; j++) {
				if (a[i] + a[j] == 10) {
					if (!output.contains("(" + j + " ,"+ i + ")"))
					output.add("(" + i + " ,"+ j + ")" );
				}
			 }
		}
			
		System.out.println(output);

	}

}
