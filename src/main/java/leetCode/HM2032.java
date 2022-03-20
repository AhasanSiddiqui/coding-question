package com.ahasan.arraysdemo.leetCode;

import java.util.ArrayList;
import java.util.List;

public class HM2032{
	public static void main(String[] args){
		int[] nums1={1 ,1 ,3 ,2};
		int[] nums2={2 ,3};
		int[] nums3={3};
		System.out.println(twoOutOfThree(nums1,nums2,nums3));
	}

	public static List<Integer> twoOutOfThree(int[] nums1 ,int[] nums2 ,int[] nums3){
		List<Integer> nums1List=new ArrayList<>();
		for (int i : nums1) {
			nums1List.add(i);
		}
		List<Integer> result1=new ArrayList<>();
		List<Integer> result2=new ArrayList<>();

		for (int i=0; i < nums2.length; i++) {
			if (nums1List.contains(nums2[i])) {
				result1.add(nums2[i]);
			}
		}

		for (int i=0; i < nums3.length; i++) {
			if (result1.contains(nums3[i])) {
				result2.add(nums3[i]);
			}
		}
		return result2;
	}
}
