package com.dayOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveStringWithConvectiveVowels {
	// Remove string where two vowels are consecutive
	public static void main(String[] args) {
		
		List<String> array = Arrays.asList("create" , "edit", "delete", "queue" , "stack");
		List<String> remove = new ArrayList<>();
		List<String> finalArr = new ArrayList<>();
		for (String s : array) {
			String [] c = s.split("");
			for(int i= 0 ; i < c.length-1 ; i++) {
			if (c[i].contains("a")|| c[i].contains("e")|| c[i].contains("i")|| c[i].contains("o")|| c[i].contains("u")) {
				if(c[i+1].contains("a")|| c[i+1].contains("e")|| c[i+1].contains("i")|| c[i+1].contains("o")|| c[i+1].contains("u")) {
					remove.add(s);
					break;
					}
				}
			}	
		}
		
		for (String t : array) {
			if (!remove.contains(t)) {
				finalArr.add(t);
			}
		}
		
		System.out.println(finalArr);
	}

}
