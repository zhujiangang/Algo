package com.hihocoder.netease;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.nextLine();
		char[][] arr = new char[3][3];
		for(int t=0; t<N; t++){
			for(int l=0; l<3; l++){
				String line = scanner.next();
				arr[l][0] = line.charAt(0);
				arr[l][1] = line.charAt(1);
				arr[l][2] = line.charAt(2);
				scanner.nextLine();
			}
			scanner.nextLine();
			//scanner.nextLine();
			
			int[] res = isValid(arr);
			if(res[1]>res[0])
				System.out.println("Invalid");
			else if(isFinal(arr, 'O'))
				System.out.println("O win");
			else if(isFinal(arr, 'X'))
				System.out.println("X win");
			else if(res[1]+res[0]==9)
				System.out.println("Draw");
			else if(res[1]==res[0] && isWin(arr, 'X'))
				System.out.println("Next win");
			else if(res[1]>res[0] && isWin(arr, 'O'))
				System.out.println("Next win");
			else
				System.out.println("Next cannot win");
			
		}
	}

	public static boolean isWin(char[][] arr,char ch){
		for(int i=0; i<3; i++){
			if(arr[i][0]==ch && arr[i][1]==ch && arr[i][2]=='_')
				return true;
			else if(arr[i][0]==ch && arr[i][2]==ch && arr[i][1]=='_')
				return true;
			else if(arr[i][2]==ch && arr[i][1]==ch && arr[i][0]=='_')
				return true;
		}
		
		for(int i=0; i<3; i++){
			if(arr[0][i]==ch && arr[1][i]==ch && arr[2][i]=='_')
				return true;
			else if(arr[0][i]==ch && arr[2][i]==ch && arr[1][i]=='_')
				return true;
			else if(arr[2][i]==ch && arr[1][i]==ch && arr[0][i]=='_')
				return true;
		}
		if(arr[0][0]==ch && arr[1][1]==ch && arr[2][2]=='_')
			return true;
		else if(arr[0][0]==ch && arr[1][1]=='_' && arr[2][2]==ch)
			return true;
		else if(arr[0][0]=='_' && arr[1][1]==ch && arr[2][2]==ch)
			return true;
		
		if(arr[2][0]==ch && arr[1][1]==ch && arr[0][2]=='_')
			return true;
		else if(arr[2][0]==ch && arr[1][1]=='_' && arr[0][2]==ch)
			return true;
		else if(arr[2][0]=='_' && arr[1][1]==ch && arr[0][2]==ch)
			return true;
		return false;
	}
	public static int[] isValid(char[][] arr){
		int xCnt = 0;
		int oCnt = 0;
		int[] res = new int[2];
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(arr[i][j]=='O')
					oCnt++;
				if(arr[i][j]=='X')
					xCnt++;
			}
		}
		res[0] = xCnt;
		res[1] = oCnt;
		return res;
	}
	public static boolean isFinal(char[][] arr,char ch){
		for(int i=0; i<3; i++){
			if(arr[i][0]==ch && arr[i][1]==ch && arr[i][2]==ch)
				return true;
		}
		
		for(int i=0; i<3; i++){
			if(arr[0][i]==ch && arr[1][i]==ch && arr[2][i]==ch)
				return true;
		}
		if(arr[0][0]==ch && arr[1][1]==ch && arr[2][2]==ch)
			return true;
		if(arr[2][0]==ch && arr[1][1]==ch && arr[0][2]==ch)
			return true;
		return false;
	}
}
