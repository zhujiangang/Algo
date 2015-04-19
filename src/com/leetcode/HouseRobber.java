package com.leetcode;

import java.util.Arrays;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public static int rob(int[] num) {
		//int[][] dp = new int[num.length+1][2];
		//dp[0][0] = dp[0][1] = 0;
		int dp0 = 0;
		int dp1 = 0;
		for (int i = 0; i < num.length; i++) {
//			dp[i+1][0] = Math.max(dp[i][0], dp[i][1]);
//			dp[i+1][1] = dp[i][0] + num[i];
			dp0 = Math.max(dp1, dp0);
			dp1 = dp0+num[i];
		}
		
//		return Math.max(dp[num.length][0],dp[num.length][1]);
		return Math.max(dp0, dp1);
	}
}
