package com.hihocoder.netease;

import java.util.Arrays;
import java.util.Scanner;

public class Main2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int S = scanner.nextInt();

		scanner.nextLine();
		int xBox = 0, yBox = 0;
		int xDest = 0, yDest = 0;
		int xUser = 0, yUser = 0;
		char[][] arr = new char[M][N];
		for (int i = 0; i < M; i++) {
			String line = scanner.next();
			for (int j = 0; j < N; j++) {
				arr[i][j] = line.charAt(j);
				if (arr[i][j] == '3') {
					xBox = i;
					yBox = j;
				}
				if (arr[i][j] == '2') {
					xDest = i;
					yDest = j;
				}
				if (arr[i][j] == '1') {
					xUser = i;
					yUser = j;
				}
			}
			scanner.nextLine();
		}
		char[][] copy = new char[M][N];
		for (int i = 0; i < M; i++) {
			// String line = scanner.next();
			for (int j = 0; j < N; j++) {
				copy[i][j] = arr[i][j];
			}
		}
		for (int i = 0; i < S; i++) {
			int T = scanner.nextInt();
			String op = scanner.next();
			scanner.nextLine();
			boolean flag = false;
			for (int x = 0; x < M; x++) {
				// String line = scanner.next();
				for (int y = 0; y < N; y++) {
					arr[x][y] = copy[x][y];
					if (arr[x][y] == '3') {
						xBox = x;
						yBox = y;
					}
					if (arr[x][y] == '2') {
						xDest = x;
						yDest = y;
					}
					if (arr[x][y] == '1') {
						xUser = x;
						yUser = y;
					}
				}
			}
			for (int j = 0; j < op.length(); j++) {
				if (flag) {
					System.out.println("NO");
					break;
				}
				switch (op.charAt(j)) {
				case 'd':
					int nextUser = (xUser + 1) % M;
					if (arr[nextUser][yUser] == 4)
						flag = true;
					else if (yUser == yBox && (xUser + 1) % M == xBox) {
						int nextX = (xBox + 1) % M;
						if (arr[nextX][yUser] == 4)
							flag = true;
						else {
							xUser = (xUser + 1) % M;
							xBox = nextX;
						}
					} else {
						xUser = nextUser;
					}
					break;
				case 'u':
					nextUser = (xUser + M - 1) % M;
					if (arr[nextUser][yUser] == 4)
						flag = true;
					else if (yUser == yBox && nextUser == xBox) {
						int nextX = (xBox + M - 1) % M;
						if (arr[nextX][yUser] == 4)
							flag = true;
						else {
							xUser = (xUser + M - 1) % M;
							xBox = nextX;
						}
					} else {
						xUser = nextUser;
					}
					break;
				case 'l':
					nextUser = (yUser + N - 1) % N;
					if (arr[xUser][nextUser] == 4)
						flag = true;
					else if (xUser == xBox && nextUser == yBox) {
						int nextY = (yBox + N - 1) % N;
						if (arr[xBox][nextY] == 4)
							flag = true;
						else {
							yUser = (yUser + N - 1) % N;
							yBox = nextY;
						}
					} else {
						yUser = nextUser;
					}
					break;
				case 'r':
					nextUser = (yUser + 1) % N;
					if (arr[xUser][nextUser] == 4)
						flag = true;
					else if (xUser == xBox && nextUser == yBox) {
						int nextY = (yBox + 1) % N;
						if (arr[xBox][nextY] == 4)
							flag = true;
						else {
							yUser = (yUser + 1) % N;
							yBox = nextY;
						}
					} else {
						yUser = nextUser;
					}
					break;
				default:
					break;
				}
			}
			if (!flag) {
				if (xBox == xDest && yBox == yDest)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}
}
