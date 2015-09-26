package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {13,14,1,2,-11,-11,-1,5,-1,-11,-9,-12,5,-3,-7,-4,-12,-9,8,-13,-8,2,-6,8,11,7,7,-6,8,-9,0,6,13,-14,-15,9,12,-9,-9,-4,-4,-3,-9,-14,9,-8,-11,13,-10,13,-15,-11,0,-14,5,-4,0,-3,-3,-7,-4,12,14,-14,5,7,10,-5,13,-14,-2,-6,-9,5,-12,7,4,-8,5,1,-10,-3,5,6,-9,-5,9,6,0,14,-15,11,11,6,4,-6,-10,-1,4,-11,-8,-13,-10,-2,-1,-7,-9,10,-7,3,-4,-2,8,-13};
		
		ThreeSum ts = new ThreeSum();
		System.out.println(ts.threeSum(nums));
	}
	
	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0)
            return ret;
        
        List<Integer> list = new ArrayList<Integer>();
        for(Integer i : nums)
            list.add(i);
        
        Collections.sort(list);
        
        for(int i=0; i<list.size(); i++){
            int target  = 0-list.get(i);
            if(list.size()-1-i<2)
                break;
            List<int[]> resOfTwoSum = twoSum(list,target,i+1, list.size()-1);
            if(resOfTwoSum==null || resOfTwoSum.size()==0)
                continue;
            
            for(int[] arr : resOfTwoSum){
                List<Integer> res = new ArrayList<Integer>();
                res.add(list.get(i));
                res.add(arr[0]);
                res.add(arr[1]);
                ret.add(res);
            }
        }
        return ret;
    }
    
    public List<int[]> twoSum(List<Integer> list, int target,int start, int end) {
        List<int[]> res = new ArrayList<int[]>();
        
        if(list==null || list.size()==0)
            return res;

        int head = start;
        int tail = end;
        
        while(head < tail){
            if(list.get(head) + list.get(tail)<target)
                head++;
            else if(list.get(head) + list.get(tail)>target)
                tail--;
            else{
                int[] ret = new int[2];
                ret[0] = list.get(head);
                ret[1] = list.get(tail);
                res.add(ret);
                head++;
            }
        }
        return res;
    }
}
