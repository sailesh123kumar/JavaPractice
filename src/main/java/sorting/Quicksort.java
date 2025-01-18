package sorting;

import java.util.Arrays;

public class Quicksort {

	
	public static int partition(int []arr ,int low , int high) {
		int pivot = arr[low];
		int start = low;
		int end = high;
		
		while(start<end) {
			while(arr[start]<=pivot) {
				start++;
			}
			while(arr[end]>pivot) {
				end--;
			}
			if(start<end) {
				int temp= arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
			}
		}
		int temp=arr[low];
		arr[low]=arr[end];
		arr[end]=temp;
		
		
		
		return end;
	}
	
	
	public static void quicksort(int[] arr , int low , int high) {
		
		if(low<high) {
			
			int lock = partition(arr, low, high);
			quicksort(arr, low, lock-1);
			quicksort(arr, lock+1, high);
			
		}
		
	}
	public static void main(String[] args) {

		int[] arr= {10,8,4,5,12,6,3,9,1};
		System.out.println("Before sorting :" +Arrays.toString(arr));

		quicksort(arr, 0, arr.length-1);
		
		System.out.println("After sorting :" +Arrays.toString(arr));
		
	}
}
