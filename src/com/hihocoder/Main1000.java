package com.hihocoder;

import java.util.Scanner;

public class Main1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextInt()){
			Integer a = scanner.nextInt();
			Integer b = scanner.nextInt();
			System.out.println(a+b);
			scanner.nextLine();
		}
	}

}
