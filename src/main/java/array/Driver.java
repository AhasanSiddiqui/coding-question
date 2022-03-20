package com.ahasan.arraysdemo.array;// { Driver Code Starts

class Reverse {
    public static void main(String[] args) {
        System.out.println(reverseWord("Ahasan"));
    }
	public static String reverseWord(String str) {
		int low = 0;
		int high = str.length() - 1;
		char ch[] = str.toCharArray();
		while (low < high) {
			swap(ch, low, high);
			low++;
			high--;
		}
		return new String(ch);
	}

	public static void swap(char ch[], int low, int high) {
		char temp = ch[low];
		ch[low] = ch[high];
		ch[high] = temp;
	}
}