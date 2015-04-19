package com.leetcode;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(compare(987, 97));
		int[] num = {0,0};
		System.out.println(largestNumber(num));
	}

	public static int compare(int a, int b){
		Long sum1 = Long.parseLong(a+""+b+"");
		Long sum2 = Long.parseLong(b+""+a+"");
		if(sum1>=sum2)
			return 1;
		else
			return -1;
	}
	public static void sort(int[] num){
		for(int i=1; i<num.length; i++){
			for(int j=1; j<num.length; j++){
				if(compare(num[j-1], num[j])==-1){
					int tmp = num[j-1];
					num[j-1] = num[j];
					num[j] = tmp;
				}
			}
		}
	}
	public static String largestNumber(int[] num) {
		sort(num);
		String ret = "";
		for(int i=0; i<num.length; i++){
			ret+=num[i];
		}
		while(ret.startsWith("0") && !ret.substring(1).trim().equals(""))
			ret = ret.substring(1);
		return ret;
	}
}
