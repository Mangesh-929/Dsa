package com.sorting;

import java.util.Arrays;

public class QuickSort1Main {
	 public static void main(String args[]) {

		 int[] arr = { 45, 16, 26, 18, 6, 15, 3, 10, 5, 20 };
		    int n = arr.length;
            QuickSort1.quickSort(arr, 0, n - 1);
            System.out.println("Sorted Array in Ascending Order ");
		    System.out.println(Arrays.toString(arr));
		  }

}
