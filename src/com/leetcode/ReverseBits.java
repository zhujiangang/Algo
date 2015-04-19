package com.leetcode;

public class ReverseBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	long pow(int n,int k){
		long ret = 1;
        for(int i=0; i<k; i++){
            ret = ret*n;
        }
        return ret;
    }
    long reverseBits(long n) {
        if(n==0)
            return 0;
        int[] bit = new int[32];
        for(int i=0; i<32; i++)
        	bit[i] = 0;
        
        int i = 0;
        while(n>0){
            long yushu = n%2;
            long shang = n/2;
            if(yushu==0)
                bit[i] = 0;
            if(shang==0 || yushu==1)
                bit[i] = 1;
            i++;
            n = shang;
        }
        long ret = 0;
        for(i=31; i>=0; i--){
            ret += bit[i]*pow(2,31-i);
        }
        return ret;
    }
}
