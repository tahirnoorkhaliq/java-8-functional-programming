package com.tahir.sorting.algo;

import java.util.Arrays;

public class SelectionSort {
	  public void selectionSort(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            int minIndex = i;
	            for (int j = i+1; j < array.length; j++) {
	                if (array[j] < array[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            if (i != minIndex) {
	                int temp = array[i];
	                array[i] = array[minIndex];
	                array[minIndex] = temp;
	            }
	            System.out.println(Arrays.toString(array));
	        }
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
		SelectionSort ob = new SelectionSort();
		int arr[] = { 70,64, 250, 112, 2, 1 };
		ob.selectionSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}
/* This code is contributed by Rajat Mishra */
