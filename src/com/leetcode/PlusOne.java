package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {1,0};
		int[] ret = plusOne(digits);
		for(int i=0; i<ret.length; i++)
			System.out.println(ret[i]);
	}

	public static int[] plusOne(int[] digits) {
		List<Integer> list = new ArrayList<Integer>();
        int addOne = 0;
        for(int i=digits.length-1; i>=0; i--){
            int val = 0;
            if(i==digits.length-1)
                val = digits[i]+1+addOne;
            else
                val = digits[i]+addOne;
            if(val>=10){
                val = val-10;
                addOne = 1;
            }else
                addOne = 0;
            list.add(val);
        }
        if(addOne!=0)
            list.add(addOne);
        int[] ret = new int[list.size()];
        for(int i=list.size()-1; i>=0; i--){
            ret[list.size()-1-i] = list.get(i);
        }
        return ret;
    }
}
