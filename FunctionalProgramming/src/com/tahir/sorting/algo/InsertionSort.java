package com.tahir.sorting.algo;

import java.util.Arrays;

public class InsertionSort {
	public void insertionSort(int[] array) {
		System.out.println(Arrays.toString(array));
		for (int i = 1; i < array.length; i++) {
			System.out.println("i=" + i);
			int temp = array[i];
			int j = i - 1;
			while (j > -1 && temp < array[j]) {
				array[j + 1] = array[j];
				array[j] = temp;
				System.out.println(Arrays.toString(array));
				j--;
			}

		}

		System.out.println(Arrays.toString(array));
	}

	// Prints the array
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver code to test above
	public static void main(String args[]) {
		InsertionSort ob = new InsertionSort();
		int arr[] = { 70,64, 250, 112, 2, 1 };
		ob.insertionSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}

}
