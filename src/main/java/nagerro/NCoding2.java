package com.ahasan.arraysdemo.nagerro;


/*Q2. Input an array and prints the second minimum in an array??
Example
Input:34,45,21,12,54,67,15
Output:15*/
public class NCoding2{
	public static void main(String[] args){
		//secondMin(new int[]{34,45,21,12,54,67,15});
		secondMin2(new int[]{34,45,21,12,54,67,15});
	}

	private static void secondMin(int[] elements){
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] < smallest) {
				secondSmallest = smallest;
				smallest = elements[i];
			} else if (elements[i] < secondSmallest) {
				secondSmallest = elements[i];
			}
		}

		for (int i=0; i < elements.length; i++) {
			if(smallest>elements[i]) {
				secondSmallest=smallest;
				smallest=elements[i];
			} else if(elements[i]<secondSmallest) {
				secondSmallest=elements[i];
			}
		}

	}

	private static void secondMin2(int[] elements){
		int min;
		int secondMin;
		min=secondMin=Integer.MAX_VALUE;

		for (int i=0; i < elements.length; i++) {
			min=Integer.min(min,elements[i]);
		}

		for (int i=0; i < elements.length; i++) {
			if(min!=elements[i]){
				secondMin=Integer.min(secondMin,elements[i]);
			}

		}

		System.out.println(secondMin);
	}
}
