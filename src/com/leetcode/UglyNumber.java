package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class UglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//"anagtam", "nbgbram"
		System.out.println(isAnagram("a", "b"));
	}

	public static boolean isUgly(int num) {
		if (num == 1)
			return true;
		if (num == 0)
			return false;

		while (num != 1) {
			if (num % 2 == 0) {
				num /= 2;
			} else if (num % 3 == 0) {
				num /= 3;
			} else if (num % 5 == 0) {
				num /= 5;
			} else
				return false;
		}
		return true;
	}

	public static int min(int a, int b, int c) {
		if (a <= b && a <= c)
			return a;
		if (b <= a && b <= c)
			return b;
		return c;
	}

	public static int nthUglyNumber(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		if (n == 3)
			return 3;
		if (n == 4)
			return 4;
		if (n == 5)
			return 5;
		return 2 * min(nthUglyNumber(n - 1), nthUglyNumber(n - 2),
				nthUglyNumber(n - 3));

	}
	
	public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        Map<String,Integer> map1 = new HashMap<String,Integer>();
        Map<String,Integer> map2 = new HashMap<String,Integer>();
        
        for(int i=0; i<s.length()-1; i++){
            String ch = s.substring(i,i+1);
            if(map1.get(ch)!=null)
                map1.put(ch,map1.get(ch)+1);
            else
                map1.put(ch,1);
        }
        
        for(int i=0; i<t.length()-1; i++){
            String ch = t.substring(i,i+1);
            if(map2.get(ch)!=null)
                map2.put(ch,map1.get(ch)+1);
            else
                map2.put(ch,1);
        }
        
        for(Map.Entry<String,Integer> entry : map1.entrySet()){
            if(map2.get(entry.getKey())==null || map2.get(entry.getKey())!=entry.getValue())
                return false;
        }
        return true;
    }
}
