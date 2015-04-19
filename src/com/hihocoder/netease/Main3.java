package com.hihocoder.netease;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int S = scanner.nextInt();
		scanner.nextLine();
		int[][] arr = new int[202][202];
		Arrays.fill(arr, 0);
		for(int t=0; t<S; t++){
			int N = scanner.nextInt();
			int M = scanner.nextInt();
			for(int i=1; i<N; i++){
				for(int j=1; j<M; j++){
					arr[i][j] = scanner.nextInt();
				}
				scanner.nextLine();
			}
			int X = scanner.nextInt();
			int Y = scanner.nextInt();
			int K = scanner.nextInt();
			scanner.nextLine();
			for(int i=0; i<N; i++){
				for(int j=0; j<M; j++){
					if(i==X && j==Y)
						continue;
					if(arr[i][j]!=arr[X][Y])
						continue;
					
				}
			}
		}
	}
	
//	public static int getPath(int[][] arr, int i,int j,int x,int y,int N,int M){
//		/*Arround*/
//		if(y==j && i==x-1)
//			return 0;
//		if(y==j && i==x+1)
//			return 0;
//		if(x==i && j==y-1)
//			return 0;
//		if(x==i && j==y+1)
//			return 0;
//		
//		/*Same outer line*/
//		if((x==0 && i==0) || (x==N-1 && i==N-1))
//			return 2;
//		if((y==0 && j==0) || (y==M-1 && j==M-1))
//			return 2;
//	}
//	class Point{
//		int x;
//		int y;
//		public Point(int x,int y){
//			this.x = x;
//			this.y = y;
//		}
//	}
//	public void BFS(int[][] G,int startX,int startY,int endX, int end ,int N,int M){
//		int[][] visited = new int[N][M];
//		Arrays.fill(visited, 0);
//		
//		Queue<Point> queue = new LinkedList<Point>();
//		Point p = new Point(startX,startY);
//		queue.offer(p);
//		visited[startX][startY] = 1;
//		for(int i=0; i<N; i++){
//			for(int j=0; j<M; j++){
//				if(startX!=i && startY!=j && visited[i][j]==0){
//					
//				}
//			}
//		}
//	}
}
