package com.ahasan.arraysdemo.strings;

class Main {
    public String longestCommonPrefix(String[] S) {
        if (S == null || S.length == 0) return "";
        for (int i = 0; i < S[0].length() ; i++){
            char c = S[0].charAt(i);
            for (int j = 1; j < S.length; j ++) {
                if (i == S[j].length() || S[j].charAt(i) != c)
                    return S[0].substring(0, i);             
            }
        }
        return S[0];
    }
    public static void main(String args[]) {
        // Your code goes here
        Main ob = new Main();
        String s[] = {"flower", "flow", "flight"};
        System.out.println(ob.longestCommonPrefix(s));
    }
}