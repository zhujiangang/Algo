package com.leetcode;

import java.math.BigInteger;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(atoi("   +0 123"));
	}

	public static String normalize(String s){
		while(s.startsWith("0"))
			s = s.substring(1);
		return s;
	}
	public static int compare(String s1,String s2){
		s1 = normalize(s1);
		s2 = normalize(s2);
		if(s1.length()>s2.length())
			return 1;
		if(s1.length()<s2.length())
			return -1;
		for(int i=0; i<s1.length(); i++){
			Integer i1 = Integer.parseInt(Integer.toString(s1.charAt(i)));
			Integer i2 = Integer.parseInt(Integer.toString(s2.charAt(i)));
			if(i1>i2)
				return 1;
			if(i1<i2)
				return -1;
		}
		return 0;
	}
	public static int atoi(String str) {
		if(str==null)
			return 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
        	char ch = str.charAt(i);
        	if(ch!=' ' && !Character.isDigit(ch) && ch!='+' && ch!='-')
        		break;
        	if(Character.isDigit(ch))
        		sb.append(ch);
        	else if(sb.toString().trim().equals("") && (ch=='+' || ch=='-')){
        		sb.append(ch);
        	}else if(!sb.toString().trim().equals(""))
        		break;
        }
        if(sb.toString().trim().equals("+") || sb.toString().trim().equals("-") || sb.toString().trim().equals(""))
        	return 0;
        String num = sb.toString();
        if(num.startsWith("-")){
        	num = num.substring(1);
        	if(compare(num,"2147483648")==1)
        		return Integer.MIN_VALUE;
        }else if(num.startsWith("+")){
        	num = num.substring(1);
        	if(compare(num, "2147483647")==1)
        		return Integer.MAX_VALUE;
        }else{
        	if(compare(num,"2147483647")==1)
        		return Integer.MAX_VALUE;
        }
        return Integer.parseInt(sb.toString());
    }
}
