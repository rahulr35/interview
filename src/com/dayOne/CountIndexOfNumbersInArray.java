package com.dayOne;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountIndexOfNumbersInArray {

	public static void main(String[] args) {
		int p[] = { 10, 20, 20, 10, 30, 30, 40, 30, 20  };
		Map<Integer, Map<Integer, String>> map = new LinkedHashMap<>();

		for (int i = 0; i < p.length; i++) {
			if (map.containsKey(p[i])) {
				Map<Integer, String> temp = map.get(p[i]); 
				int count = (int) (temp.keySet().toArray())[0] + 1; 
				String newIndex = temp.get(count - 1) + "," + i;  
				temp.clear();
				temp.put(count, newIndex);
				map.put(p[i], temp);
			} else {
				Map<Integer, String> tem = new HashMap<>();
				tem.put(1, String.valueOf(i));
				map.put(p[i], tem);
			}
		}
		
		System.out.println("Int| Count | Index |");
		for (Entry <Integer, Map<Integer, String>> entry : map.entrySet()) {
			System.out.print(entry.getKey() + " | ");
			Map<Integer, String> m = entry.getValue();
			for(Entry <Integer, String> e : m.entrySet()) {
				System.out.print(e.getKey() + "     | "+ e.getValue() + " | ");
				System.out.println();
			}
		}
	}

}
