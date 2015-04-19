package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main2 main2 = new Main2();
		main2.process();
	}
	
	public void process(){
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		List<Point> points = new ArrayList<Point>();
		scanner.nextLine();
		for(int i=0; i<N; i++){
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			scanner.nextLine();
			Point point = new Point(x,y);
			points.add(point);
		}
		int min = Integer.MAX_VALUE;
		Boolean[] flag = new Boolean[N];
		Arrays.fill(flag, false);
		flag[0] = true;
		int[] dist = new int[N];
		dist[0] = 0;
		Point start = points.get(0);
		int v = 0;
		for (int i=1; i<points.size(); i++){
			int d = Math.min(Math.abs(points.get(i).getX()-start.getX()), Math.abs(points.get(i).getY()-start.getY()));
			dist[i] = d;
		}
		for(int i=1; i<points.size(); i++){
			min = Integer.MAX_VALUE;
			for(int j=0; j<points.size(); j++){
				if(!flag[j]){
					if(dist[j]<min){
						v = j;
						min = dist[j];
					}
					
				}
			}
			flag[v] = true;
			for(int j=0; j<points.size(); j++){
				int d = Math.min(Math.abs(points.get(j).getX()-points.get(v).getX()), Math.abs(points.get(j).getY()-points.get(v).getY()));
				if(!flag[j] && (min+d<dist[j]))
					dist[j] = min+d;
			}
		}
		System.out.println(dist[N-1]);
	}
	class Point{
		int x,y;
		
		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
		
	}

}
