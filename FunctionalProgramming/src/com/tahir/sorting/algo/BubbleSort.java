package com.tahir.sorting.algo;

import java.util.Arrays;

public class BubbleSort {
	
	

	  public void bubbleSort(int[] array) {
		  System.out.println(Arrays.toString(array));
		  for (int i =array.length-1;i>0; i--) {
			  System.out.println("i="+i);
	            for (int j = 0; j < i; j++) {
	            	 System.out.println("j="+j);
	                if (array[j] > array[j+1]) {
	                	int temp = array[j];
	 	                array[j] = array[j+1];
	 	                array[j+1] = temp; 
	 	               System.out.println(Arrays.toString(array));
	                }
	               
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
		BubbleSort ob = new BubbleSort();
		int arr[] = { 70,64, 250, 112, 2, 1 };
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}

}
