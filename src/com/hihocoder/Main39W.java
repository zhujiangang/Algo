package com.hihocoder;

import java.util.Scanner;

public class Main39W {
	public static long cnt = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scanner.nextInt();
		mergeSort(arr);
		System.out.println(cnt);
	}

	public static void mergeSort(int[] a) {
		if (a.length == 1)
			return;
		int mid = a.length / 2;
		int[] left = new int[mid];
		int[] right = new int[a.length - mid];
		System.arraycopy(a, 0, left, 0, mid);
		System.arraycopy(a, mid, right, 0, a.length - mid);
		mergeSort(left);
		mergeSort(right);
		merge(left, right, a);
	}

	public static void merge(int[] a, int[] b, int[] dest) {
		int i = 0;
		int j = 0;
		int k = 0;
		
		long froma = 0;
		long fromb = 0;
		while (i < a.length && j < b.length) {
			if (a[i] <= b[j]) {
				dest[k++] = a[i];
				froma++;
				i++;
				cnt += fromb;
			} else {
				dest[k++] = b[j];
				fromb++;
				j++;
			}
		}
		while (i < a.length) {
			dest[k++] = a[i++];
			cnt += fromb;
		}
		while (j < b.length)
			dest[k++] = b[j++];
	}
}
