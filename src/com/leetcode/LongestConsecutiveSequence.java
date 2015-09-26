package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {};
		System.out.println(longestConsecutive(nums));
	}

	public static int longestConsecutive(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++)
            list.add(nums[i]);
        Collections.sort(list);
        int length = 1;
        int start = 0;
        int max = 1;
        for(int i=1; i<list.size(); i++)
            if(list.get(i)-list.get(i-1)!=1){
                if(length>max)
                    max = length;
                length = 1;
                start = i;
            }else{
                length++;
            }
        if(length>max)
            max = length;
        return max;
    }
	
}
