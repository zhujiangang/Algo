package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FractionToRecurringDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fractionToDecimal(1, 17));
	}

	public static int getLength(int n){
		String s  =""+n;
		return s.length();
	}
	public static String fractionToDecimal(int numerator, int denominator) {
		int zhengshu = numerator/denominator;
		int yushu = numerator%denominator;
		String ret = zhengshu+"";
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		int pos = 0;
		if(yushu!=0){
			ret += ".";
			int yushu1 = yushu*10;
			int curPos = pos;
			while(yushu1<denominator){
				yushu1 = yushu1 * 10;
				ret += "0";
				yushu*=10;
				pos++;
			}
			int newYushu = yushu1 % denominator;
			int newShang = yushu1 / denominator;
			ret += newShang;
			map.put(yushu, curPos);
//			pos = pos+getLength(yushu);
			while(newYushu!=0){
				
				yushu1 = newYushu*10;
				curPos = pos;
				while(yushu1<denominator){
					yushu1 = yushu1 * 10;
					newYushu*=10;
					ret += "0";
					pos++;
				}
				if(map.keySet().contains(newYushu))
					break;
				map.put(newYushu, curPos);
//				pos = pos+getLength(yushu);
//				pos++;				
				newYushu = yushu1 % denominator;
				newShang = yushu1 / denominator;
				ret += newShang;
			}
			if(newYushu!=0){
				String xiaoshu = ret.split("\\.")[1];
				int start = map.get(newYushu);
				String xunhuan = xiaoshu.substring(start, pos);
				xiaoshu = xiaoshu.substring(0, start);
				xiaoshu = xiaoshu + "("+xunhuan+")";
				ret = ret.split("\\.")[0]+"."+xiaoshu;
			}
			
		}
		return ret;
	}
}
