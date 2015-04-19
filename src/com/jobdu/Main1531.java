package com.jobdu;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main1531 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N;
		while (scanner.hasNext()) {
			N = scanner.nextInt();
			scanner.nextLine();
			int[] arr = new int[N];
			int sum = 0;
			for (int i = 0; i < N; i++) {
				arr[i] = scanner.nextInt();
				sum += arr[i];
			}
			Arrays.sort(arr);
			System.out.println(bag3(arr, sum));
			scanner.nextLine();
		}
	}

	public static int bag3(int[] arr, int sum){
		int ans = 0;  
        for (int i = 0; i < arr.length; i++){  
            if (arr[i] > ans + 1){  
                break;  
            }  
            else  
                ans += arr[i];  
        }  
        return ans+1;
	}
	public static int bag2(int[] arr, int sum){
		int[] dp = new int[sum + 1];
		Arrays.fill(dp, 0);
		dp[0] = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = sum-arr[i]; j >= 0; j--) {
				if(dp[j]==1)
					dp[j+arr[i]] = 1;
			}
		}
		for(int i=0; i<=sum; i++){
			if(dp[i]!=1)
				return i;
		}
		return sum+1;
	}
	public static int bag(int[] arr, int sum) {
		int[] dp = new int[sum + 1];
		Arrays.fill(dp, 0);
		for (int i = 0; i < arr.length; i++) {
			for (int j = sum; j >= arr[i]; j--) {
				dp[j] = Math.max(dp[j], dp[j - arr[i]] + arr[i]);
			}
		}
		for(int i=1; i<=sum; i++){
			if(dp[i]!=i)
				return i;
		}
		return sum+1;
	}

}
