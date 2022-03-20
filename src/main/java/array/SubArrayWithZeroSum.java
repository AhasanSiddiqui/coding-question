package com.ahasan.arraysdemo.array;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {

	public static void main(String[] args) {
		int arr[]={2,3,-2,-3
		};

		int n=5;
		System.out.println(findSum(arr,arr.length));
	}

	public static boolean findSum(int arr[],int n)
	{
		int sum =0;
		Set<Integer> set =new HashSet<>();
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			if(arr[i]==0 || sum == 0 || set.contains(sum)){
				return true;
			}
			set.add(sum);
		}
		return false;
	}
}
