package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = { 12, 6, 22, 14, 8, 7, 5, 11, 4, 2 };

		insertion_sort(arr);

		System.out.println(Arrays.toString(arr));
	}

	/**
	 * start with the second element i.e index 1 compare it with element from sorted
	 * which is left of it insert it into its correct position in the sorted part
	 * repeat for all the elements in the array
	 * 
	 * @param arr
	 */
	private static void insertion_sort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = key;

		}
	}

}
