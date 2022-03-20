package com.ahasan.arraysdemo.array;

public class SumTwoSortedArray {
	public static void main(String[] args) {
		int[] nums1={1,3};
		int[] nums2={2,7};
		System.out.println(findMedianSortedArrays(nums1,nums2));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double sum=0;
		double median=0.0;
		for(int i=0;i<nums1.length;i++) {
			sum += nums1[i];
		}

		for(int i=0;i<nums2.length;i++) {
			sum += nums2[i];
		}

		median =sum/(nums1.length+nums2.length);
		return median;
	}
}
