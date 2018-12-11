package com.trainning.day2;

public class InsertionSortAlgorithm implements SortAlgorithm {

	private int array[];

	@Override
	public int[] sort(int[] arr) {
		array = arr;
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					swapNumbers(j - 1, j);
				}
			}
		}
		return arr;
	}

	@Override
	public int[] sortDesc(int[] arr) {
		sort(arr);
		reverseArray(arr);
		return arr;
	}

	public int[] reverseArray(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[len - i - 1];
			arr[len - i - 1] = temp;
		}
		return arr;
	}

	private void swapNumbers(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String[] args) {
		InsertionSortAlgorithm sort = new InsertionSortAlgorithm();
		int[] arr = { 10, 4, 6, 2, 9, 1, 7, 8, 3 };
		sort.sort(arr);
		for (int i : sort.array) {
			System.out.print(i + " ");
		}
	}

}
