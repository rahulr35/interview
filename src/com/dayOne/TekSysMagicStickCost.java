package com.dayOne;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TekSysMagicStickCost {

	public static void main(String args[]) {
		int input1 = 3;
		int[] input2 = { 1, 2, 3 };
		int[] input3 = { 20, 30, 40 };
		magicStick(input1, input2, input3);
	}

	public static int magicStick(int input1, int[] input2, int[] input3) {
		List<Integer> costList = new ArrayList<>();
		for (int i = 0; i < input2.length; i++) {
			int cost = 0;
			for (int j = 0; j < input2.length; j++) {
				cost += Math.abs((input2[j] - (i+1))) * input3[j];
			}
			costList.add(cost);
		}
		
		System.out.println(costList);
		int minCost = costList.stream().min(Comparator.naturalOrder()).get();
		System.out.println(minCost);
		return minCost;
	}
}
