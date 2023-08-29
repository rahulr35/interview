package com.dayOne;

import java.util.*;
import java.util.Map.Entry;

public class iOsVersion {

	public static void main(String args[]) {

		// 2.0.1 ; 2.0.2; 2.0; 2 ; 1.9.2 ; 1.9 ;
		// Print higher version
		// Exist version need not be printed
		// 1.9
		// Input List
		// =========================================
		List<String> arr = Arrays.asList("2.0.0", "2.0.2", "2.0", "2", "1.9.2", "1.9", "2.2.1");
		List<Integer> farr = new ArrayList<>();
		Map<String, Integer> storageMap = new HashMap<>();
		String in = "2";

		// Create list for comparing values & sorting
		// ===========================================

		for (String temp : arr) {
			String s = temp;
			if (s.length() < 5) {
				int diff = 5 - s.length();
				if (diff == 2) {
					s += ".0";
				} else {
					s += ".0.0";
				}
			}
			int i = Integer.valueOf(s.replace(".", ""));
			storageMap.put(temp, i);
			farr.add(i);
		}

		Collections.sort(farr);
		System.out.println(farr);
		System.out.println(storageMap);

		// Handling Inputs (both in the list & not in list)
		// =================================================
		int input = 0;
		if (storageMap.containsKey(in)) {
			input = storageMap.get(in);
		} else if (in.length() < 5) {
			int diff = 5 - in.length();
			if (diff == 2) {
				in += ".0";
			} else {
				in += ".0.0";
			}
			input = Integer.valueOf(in.replace(".", ""));
		}

		// Printing the list of version greater than input
		// ================================================
		for (Integer i : farr) {
			if (i > input) {
				System.out.print(i + ", ");
				System.out.println();
				for (Entry<String, Integer> entry : storageMap.entrySet()) {
					if (entry.getValue().equals(i)) {
						System.out.print(entry.getKey() + ", ");
					}
				}
			}
		}
	}
}
