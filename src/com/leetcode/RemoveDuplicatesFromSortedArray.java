package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,1,2,3};
		System.out.println(removeDuplicates(A));
		for(Integer i : A)
			System.out.println(i);
	}
	
	public static int removeDuplicates(int[] A) {
        List<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<A.length; i++){
            if(set.contains(A[i]))
                continue;
            list.add(A[i]);
            set.add(A[i]);
        }
        //A = new int[list.size()];
        for(int i=0; i<list.size(); i++)
            A[i] = list.get(i);
        return list.size();
    }
}
