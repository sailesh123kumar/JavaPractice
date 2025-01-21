package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 12, 6, 22, 14, 8, 7, 5, 11, 4, 2 };

		selection_sort(arr);

		System.out.println(Arrays.toString(arr));

	}

	/**
	 * 1.Divide the arrays in to two parts sorted oth and unsorted from 1st element
	 * 2.Find the smallest element from the unsorted array 
	 * 3.swap it with the leftmost unsorted element
	 * 4.move the boundary of the sorted part to one step right 5.repeat until the
	 * array get sorted
	 * 
	 * @param arr
	 */
	private static void selection_sort(int[] arr) {

		for (int i = 0; i < arr.length - 2; i++) {
			int minIndex = i;
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}

			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;

		}
	}

}
