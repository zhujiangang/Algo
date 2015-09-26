package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSumClosest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeSumClosest tsc = new ThreeSumClosest();
		int[] nums = {0,2,1,-3};
		System.out.println(tsc.threeSumClosest(nums, 1));
	}

	public int threeSumClosest(int[] nums, int target) {
        if(nums==null || nums.length==0)
            return 0;
        
        List<Integer> list = new ArrayList<Integer>();
        for(Integer i : nums)
            list.add(i);
        
        int res = 0;
        Collections.sort(list);
        
        int min = Integer.MAX_VALUE;
        for(int i=0; i<list.size(); i++){
            int t  = target-list.get(i);
            if(list.size()-1-i<2)
                break;
            if(i > 0 && list.get(i) == list.get(i-1))
                continue;
            int resOfTwoSum = twoSum(list,t,i+1, list.size()-1);
            if(Math.abs(resOfTwoSum+list.get(i)-target)<min){
                min = Math.abs(resOfTwoSum+list.get(i)-target);
                res = resOfTwoSum+list.get(i);
            }
        }
        return res;
    }
    
    public int twoSum(List<Integer> list, int target,int start, int end) {
        int res = 0;
        
        if(list==null || list.size()==0)
            return res;

        int head = start;
        int tail = end;
        int diff = Integer.MAX_VALUE;
        while(head < tail){
            int tmp = list.get(head) + list.get(tail);
            if(tmp<target){
                if(target-tmp < diff){
                    diff = target-tmp;
                    res = tmp;
                }
                head++;
            }
            else if(tmp > target){
                if(tmp-target < diff){
                    diff = tmp-target;
                    res = tmp;
                }
                tail--;
            }else
                return target;
        }
        return res;
    }
}
