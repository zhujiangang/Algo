package com.leetcode;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {5,4};
		int elem = 4;
		System.out.println(removeElement(A, elem));
	}

	public static int removeElement(int[] A, int elem) {
        int[] B = new int[A.length];
        int len = 0;
        for(int i=0; i<A.length; i++){
            if(A[i]==elem)
                continue;
            B[len++] = A[i];
        }
        //A = new int[len];
        for(int i=0; i<len; i++)
            A[i] = B[i];
        return len;
    }
}
