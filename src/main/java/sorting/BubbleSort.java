package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 12, 6, 22, 14, 8, 7, 5, 11, 4, 2 };
		bubble_sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void bubble_sort(int[] arr) {

		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

}
