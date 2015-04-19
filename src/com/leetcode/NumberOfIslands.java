package com.leetcode;

import java.util.Arrays;

public class NumberOfIslands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] grid = new char[1][1];
		grid[0][0] = '1';
		System.out.println(numIslands(grid));
	}

	public static boolean flag = false;

	public static int numIslands(char[][] grid) {
		boolean[][] visited = new boolean[grid.length][];
		for (int i = 0; i < grid.length; i++)
			visited[i] = new boolean[grid[i].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				visited[i][j] = false;
			}
		}
		int res = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				flag = false;
				process(i, j, grid, visited);
				if (flag)
					res++;
			}
		}
		return res;
	}

	public static void process(int i, int j, char[][] grid, boolean[][] visited) {
		if (grid[i][j] != '1' || visited[i][j])
			return;
		visited[i][j] = true;
		flag = true;
		if (j >= 1)
			process(i, j - 1, grid, visited);
		if (i >= 1)
			process(i - 1, j, grid, visited);
		if(i+1<grid.length)
			process(i + 1, j, grid, visited);
		if(j+1<grid[0].length)
			process(i, j + 1, grid, visited);
	}
}
