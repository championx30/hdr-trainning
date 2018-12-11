package com.trainning.day2;

import java.util.Arrays;

public class Number {

	public static int[] sortDesc(int[] arr) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] > arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		return arr;
	}

	public static int[] sortAsc(int[] arr) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		return arr;
	}

	public static int max(int[] arr) {
		int maxValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}

	public static int min(int[] arr) {
		int minValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minValue) {
				minValue = arr[i];
			}
		}
		return minValue;
	}

	public static void main(String[] args) {

		int[] arr = { 10, 4, 6, 2, 9, 1, 7, 8, 3 };

		System.out.println(Number.min(arr));

		System.out.println(Number.max(arr));

		System.out.println(Arrays.toString(Number.sortAsc(arr)));

		System.out.println(Arrays.toString(Number.sortDesc(arr)));

	}
}
