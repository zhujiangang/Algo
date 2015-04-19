package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isValidSudoku(char[][] board) {
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < 9; i++) {
			set.clear();
			for (int j = 0; j < 9; j++) {
				StringBuilder sb = new StringBuilder();
				if (board[i][j] == '.')
					continue;
				if (set.contains(sb.append(board[i][j]).toString()))
					return false;
				set.add(sb.append(board[i][j]).toString());
			}
		}
		
		for (int i = 0; i < 9; i++) {
			set.clear();
			for (int j = 0; j < 9; j++) {
				StringBuilder sb = new StringBuilder();
				if (board[j][i] == '.')
					continue;
				if (set.contains(sb.append(board[j][i]).toString()))
					return false;
				set.add(sb.append(board[j][i]).toString());
			}
		}
		
		for(int i=0; i+3<9; i++){
			for(int j=0; j+3<9; j++){
				set.clear();
				for(int x=i; x<i+3; x++){
					for(int y=j; y<j+3; y++){
						StringBuilder sb = new StringBuilder();
						if (board[x][y] == '.')
							continue;
						if (set.contains(sb.append(board[x][y]).toString()))
							return false;
						set.add(sb.append(board[x][y]).toString());
					}
				}
			}
		}
		return true;
	}
}
