package com.leetcode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PascalTriangle pt = new PascalTriangle();
		System.out.println(pt.C(3,2).intValue());
	}

	public BigInteger jiecheng(int n){
        if(n==0)
            return BigInteger.valueOf(1);
        BigInteger res = BigInteger.valueOf(1);
        while(n>0){
            res = res.multiply(BigInteger.valueOf(n));
            n--;
        }
        return res;
    }
    public BigInteger C(int n,int k){
        return jiecheng(n-1).divide(jiecheng(k-1).multiply(jiecheng(n-k)));
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for(int i=1; i<=numRows; i++){
            List<Integer> list = new ArrayList<Integer>();
            for(int j=1; j<=i; j++)
                list.add(Integer.parseInt(C(i,j)+""));
            ret.add(list);
        }
        return ret;
    }
}
