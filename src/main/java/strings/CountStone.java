package com.ahasan.arraysdemo.strings;

import java.util.HashSet;
import java.util.Set;

public class CountStone {

	public static void main(String[] args) {
		System.out.println(numJewelsInStones("bcd", "cba"));
	}

	public static int numJewelsInStones(String jewels, String stones) {
		char []chJewel =jewels.toCharArray();
		char []chStone =stones.toCharArray();

		Set<Character> jewelsSet=new HashSet<>();
		Set<Character> stonesSet=new HashSet<>();

		int count =0;

		for (char ch : chJewel) {
			jewelsSet.add(ch);
		}

		for (char ch : chStone) {
			stonesSet.add(ch);
		}


		if(jewelsSet.size() > stonesSet.size()) {
			for (char ch : chJewel) {
				if(jewelsSet.contains(ch)){
					count++;
				}
			}
		} else {
			for (char ch : chStone) {
				if(jewelsSet.contains(ch)){
					count++;
				}
			}
		}
		if(count !=0 && count < stonesSet.size())
			return stonesSet.size();
		return count;
	}

}
