package com.leetcode;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("XXXIV"));
	}

	public static int romanToInt(String s) {
		int cnt = 0;
		int ret = 0;
		while(s.startsWith("X")){
			cnt++;
			s = s.substring(1);
		}
		ret = cnt*10;
		switch (s) {
		case "I":
			ret = ret+1;
			break;
		case "II":
			ret = ret+2;
			break;
		case "III":
			ret = ret+3;
			break;
		case "IV":
			ret = ret+4;
			break;
		case "V":
			ret = ret+5;
			break;
		case "VI":
			ret = ret+6;
			break;
		case "VII":
			ret = ret+7;
			break;
		case "VIII":
			ret = ret+8;
			break;
		case "IX":
			ret = ret+9;
			break;
		default:
			break;
		}
		return ret;
	}
}
