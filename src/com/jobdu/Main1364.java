package com.jobdu;

import java.util.Arrays;
import java.util.Scanner;

public class Main1364 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int S,C;
		while (scanner.hasNext()) {
			S = scanner.nextInt();
			C = scanner.nextInt();
			scanner.nextLine();
			int[][] arr = new int[C][2];
			//int sum = 0;
			for (int i = 0; i < C; i++) {
				arr[i][0] = scanner.nextInt();
				arr[i][1] = scanner.nextInt();
				scanner.nextLine();
				//sum += arr[i];
			}
			//Arrays.sort(arr);
			System.out.println(bag(arr,C,S));
			//scanner.nextLine();
		}
	}
	
	public static int bag(int[][] arr,int C,int S){
		int[] dp = new int[S+1];
		Arrays.fill(dp, 0);
		for(int i=0; i<C; i++){
			for(int j=S; j>=arr[i][0]; j--){
				dp[j] = Math.max(dp[j], dp[j-arr[i][0]]+arr[i][1]);
			}
		}
		return dp[S];
	}
}
