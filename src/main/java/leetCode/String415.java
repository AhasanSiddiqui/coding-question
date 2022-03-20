package com.ahasan.arraysdemo.leetCode;

public class String415{
	public static void main(String[] args){
		/*System.out.println("\n"+addStrings("3876620623801494171",
				"6529364523802684779"));*/
		addStrings("11" ,"123");
	}

	public static String addStrings(String num1 ,String num2){
		System.out.println(Integer.parseInt(num1.substring(0 ,1)));
		int[] arr1;
		int[] arr2;
		if (num1.length() >= num2.length()) {
			arr1=new int[num1.length()];
			arr2=new int[num1.length()];
		} else {
			arr1=new int[num2.length()];
			arr2=new int[num2.length()];
		}

		for (int i=0; i < num1.length(); i++) {
			arr1[i]=Integer.parseInt(num1.substring(i ,i + 1));
		}

		for (int j=0; j < arr2.length; j++) {
			arr2[j]=Integer.parseInt(num2.substring(j ,j + 1));
		}

		int temp=0;
		if (num1.length() > num2.length()) {
			temp=num1.length() - num2.length();
			leftRotate(arr2 ,temp);
		}

		if (num1.length() < num2.length()) {
			temp=num2.length() - num1.length();
			leftRotate(arr1 ,temp);
		}

		System.out.println("Arr1");
		printArray(arr1);
		System.out.println("\nArr1");
		printArray(arr2);
		return (Long.parseLong(num1) + Long.parseLong(num2)) + "";
	}

	private static void leftRotate(int[] arr ,int d){
		for (int i=0; i < d; i++)
			leftRotateByOne(arr ,arr.length);
	}

	private static void leftRotateByOne(int[] arr ,int n){
		for (int i=0; i < n - 1; i++)
			arr[i]=arr[i + 1];

	}

	private static void printArray(int[] aa){
		for (int a : aa) {
			System.out.print(a + "\t");
		}
	}
}
