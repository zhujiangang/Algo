package com.leetcode;

public class NumberOf1Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingWeight(Long.parseLong("4294967295")));
	}

	public static int hammingWeight(long n) {
        if(n==0)
            return 0;
        long yushu;
        long shang;
        shang = n/2;
        yushu = n-shang*2;
        int times = 1;
        n = shang;
        while((yushu!=0 || shang!=1) && n>0){
            if(yushu==1)
                times++;
            shang = n/2;
            yushu = n-shang*2;
            n = shang;
        }
        return times;
    }
}
