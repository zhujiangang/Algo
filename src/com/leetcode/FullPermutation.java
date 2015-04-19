package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class FullPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = {'a','b','c','d'};
		char[] out = new char[4];
		int[] cnt = {0};
		fullPermutation(s, out, 0,cnt);
	}
	
	public static void fullPermutation(char []s, char[] out ,int index, int[] cnt){
		for(int i=0; i<s.length; i++){
			boolean flag = false;
			for(int j=0; j<index; j++)
				if(out[j] == s[i])
					flag = true;
			if(flag)
				continue;
			out[index] = s[i];
			if(index<s.length-1){
				fullPermutation(s, out, index+1, cnt);
			}else{
				for(int j=0; j<s.length; j++)
					System.out.print(out[j]);
				cnt[0]++;
				//flag.clear();
				System.out.println(" "+cnt[0]);
			}
		}
	}
	
	public static void fullPermutation(char []s, char[] out ,int index){
		for(int i=0; i<s.length; i++){
			out[index] = s[i];

		}
	}
}
