package com.basic.sort;

public class MergeSort {

	public static int cnt = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSort ms = new MergeSort();
		int[] a = {8,6};
		mergeSort(a);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
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
		int froma = 0;
		int fromb = 0;
		while (i < a.length && j < b.length) {
			if (a[i] <= b[j]) {
				dest[k++] = a[i];
				i++;
				froma++;
				cnt += fromb;
			} else {
				dest[k++] = b[j];
				j++;
				fromb++;
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
