package com.dayOne;

public class RemoveRepeatingCharacter {
	
	public static void main(String[] args) {
		
		String input =  "aabbccccaaa ddffggghhh  aabb kiijjj";
		//Output: abca dfgh ab kij"
		String result = "";
		input+= " "; // For making the last comparison
		char [] s = input.toCharArray();
		for (int i = 0 ; i < s.length-1; i ++) {
			if ( s[i]!= s[i+1]) {
				result += s[i];
			}
		}
		System.out.println(result);
	}

		

}
