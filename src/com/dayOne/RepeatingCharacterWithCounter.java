package com.dayOne;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RepeatingCharacterWithCounter {

	public static void main(String [] args) {

		String input = "Raahuull";

		char[] c = input.replaceAll(" ", "").toLowerCase().toCharArray();
		Map<Character, Integer> countMap = new LinkedHashMap<>();
		for (char item : c) {
			if (countMap.containsKey(item)) {
				countMap.put(item, countMap.get(item) + 1);
			} else {
				countMap.put(item, 1);
			}
		}

		System.out.println(countMap);

		int size = 0;
		Character key = null;
		int value = 0;
		for (Entry<Character, Integer> entry : countMap.entrySet()) {
			size++;
			if (entry.getValue() == 1) {
				key = entry.getKey();
				value = entry.getValue();
			} else if (countMap.size() == size) {
				System.out.println("No repeating characters");
				break;
			}
		}
		if (key != null) {
			System.out.println(key + " " + value);
		}
	}
}
