package com.leetcode;

import java.util.HashSet;

public class CompareVersionNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compareVersion("1.0", "1"));
	}

	public static String normalize(String str){
		if(!str.contains("."))
			return str;
		String suffix = str.substring(str.lastIndexOf(".")+1);
		while(Integer.parseInt(suffix)==0){
			str = str.substring(0, str.lastIndexOf("."));
			if(!str.contains("."))
				break;
			suffix = str.substring(str.lastIndexOf(".")+1);
		}
		return str;
	}
	
	public static int compareVersion(String version1, String version2) {
		version1 = normalize(version1);
		version2 = normalize(version2);
		String[] arr1 = version1.split("\\.");
		String[] arr2 = version2.split("\\.");
		for(int i=0; i<arr1.length && i<arr2.length; i++){
			int cmp = Integer.parseInt(arr1[i])-Integer.parseInt(arr2[i]);
			if(cmp!=0)
				return cmp>0?1:-1;
		}
		if(arr1.length<arr2.length)
			return -1;
		else if(arr1.length>arr2.length)
			return 1;
		else
			return 0;
	}

}
