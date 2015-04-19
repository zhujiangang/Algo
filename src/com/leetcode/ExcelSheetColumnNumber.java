package com.leetcode;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(titleToNumber("AB"));
	}

	public static int pow(int n, int k){
		int ret = 1;
		for(int i=0; i<k; i++)
			ret = ret*n;
		return ret;
	}
	
	public static int char2Num(char ch) {
		return 1+Integer.parseInt(Integer.toString(ch))-Integer.parseInt(Integer.toString('A'));
	}
	public static int titleToNumber(String s) {
		int ret = 0;
        for(int i=s.length()-1; i>=0; i--){
        	ret += char2Num(s.charAt(i))*pow(26,s.length()-1-i);
        }
        return ret;
    }
}
