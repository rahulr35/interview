package com.dayOne;

import java.util.LinkedList;
import java.util.List;

public class AddFiveToNumber {

	public static void main(String[] args) {
		int j = -999;
		// int o = 5268; 6750; 50; -5999;
		// int j = 268; // int j = 670;
		// int j = 0;   // int j = -999;
		
		int count = 0;
		List<String> ls = new LinkedList<>();
		String res = "";

		int l = Integer.valueOf(String.valueOf(j).length());
		String[] s = String.valueOf(j).split("");
		for (String sg : s) {
			ls.add(sg);
		}

		if (j > 0) {
			if (l > 1) {
				for (int i = 0; i < s.length; i++) {
					if (Integer.valueOf(s[i]) < 5) {
						count = i;
						break;
					}
				}
			}
			ls.add(count, "5");
		} else {
			ls.add(1, "5");
		}

		for (String r : ls) {
			res += r;
		}

		System.out.println(ls);
		System.out.println(res);
	}
}
