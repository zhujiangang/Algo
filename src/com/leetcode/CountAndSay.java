package com.leetcode;

public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(10));
	}

	public static String countAndSay(int n) {
		String s = "1";
		while(--n>0){
			char last = ' ';
			Integer times = 0;
			String newString = "";
			for(int i=0; i<s.length(); i++){
				char ch = s.charAt(i);
				if(ch!=last){
					if(times!=0){
						newString += times.toString()+last;
					}
					last = ch;
					times = 1;
				}else{
					times++;
				}
			}
			if(times!=0){
				newString += times.toString()+last;
			}
			s = newString;
		}
		
		return s;
	}
}
