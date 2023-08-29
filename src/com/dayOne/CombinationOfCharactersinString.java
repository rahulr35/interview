package com.dayOne;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationOfCharactersinString {

	public static void main(String[] args) {
		String a = "abcdef";
		List<String> l = swap(a);//
		combination(l);
		
	}

	public static Set<String> combination(List<String> st) {
		Set<String> l = new HashSet<>();
		for (String a : st) {// Send the list of swapped words
			String[] c = a.split("");// {a,b,c,d}
			for (String s : c) {
				String temp = s;
				for (int i = 0; i < a.length(); i++) {
					if (s != c[i]) {
						temp = temp + c[i];
					}
				}
				l.add(temp);
			}
		}
		System.out.println(l);
		return l;
	}

	public static List<String> swap(String a) {//abcd
		List<String> l = new ArrayList<>();
		for (int i = 0; i < a.length(); i++) {
			String aOne = a.subSequence(i + 1, a.length()) + a.substring(0, i + 1);//bcda, cdab, dabc
			l.add(aOne);
		}
		return l;
	}

}
