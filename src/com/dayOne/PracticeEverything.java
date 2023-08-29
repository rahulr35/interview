package com.dayOne;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PracticeEverything {
	
	public static void reverseString() {
		String s = "Automation";
		char [] a = s.toCharArray();
		String o = "";
		for (int i = a.length-1; i >= 0;i--) {
			o = o+a[i];
		}
		System.out.println(o);
	}
	
	public static void countOfString() {
		String str = "This this is is done by Saket Saket";
		String [] s = str.split(" ");
		Map<String, Integer> a = new HashMap<>();
		for (int i = 0; i < s.length; i++) {
			if (a.containsKey(s[i])) {
				a.put(s[i], a.get(s[i])+1);
			} else {
				a.put(s[i], 1);
			}
		}
		
		for(Entry<String, Integer> entry : a.entrySet()) {
			System.out.println(entry.getKey() + " , " + entry.getValue());
		}
	}
	
	public static void swapNumber() {
		int x = 45;
		int y = 98;
		
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println(x +","+ y);
	}
	
	public static void primeNumber() {
		int n = 43;
		boolean flag = true;
		// Catch point is to start loop from 2
		for (int i = 2; i<n/2; i++) {
			if (n%i==0) {
				flag = false;
				System.out.println("Not Prime");
				break;
			}
		}
		
		if (flag) {
			System.out.println("Prime");
		}
	}
	
	public static void secondHighestNoInArray() {
		
		int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		int l = 0;
		int sl = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>l) {
				sl = l;
				l = arr[i];
			} else if (arr[i]> sl) {
				sl = arr[i];
			}
		}
		System.out.println(sl);
		System.out.println(l);
	}
	
	
	public static void armStrongNumber() {
		int a = 1634;
		int sum = 0;
		int r = 0;
		while (a > 0) {
			r = a%10;
			a = a/10;
			sum = sum + (r*r*r*r);// 4 digits only
		}
		System.out.println(sum);
	}
	
	public static void reverseNumber() {
		int a = 651615;
		String sum = "";
		int r = 0;
		while (a > 0) {
			r = a%10;
			a = a/10;
			sum = sum + r;
		}
		
		System.out.println(sum);
	}
	
	
	
	public static void main(String arg []) {
		//reverseString();
		swapNumber();
		//countOfString();
		//primeNumber();
		//secondHighestNoInArray();
		//armStrongNumber();
		//reverseNumber();
	}
}
