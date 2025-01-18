package sorting;

import java.util.Arrays;

public class MergerSort {

    public static void main(String[] args) {

        int[] arr = { 10, 8, 4, 5, 12, 6, 3, 9, 1 };
        
        mergeSort(arr, 0, arr.length-1);
        
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int low, int high) {

        if (low < high) {

            int mid = (low + high) / 2;

            mergeSort(arr, low, mid); // Sort the left half
            mergeSort(arr, mid + 1, high); // Sort the right half
            merge(arr, low, mid, high); // Merge the sorted halves
        }
    }

    private static void merge(int[] arr, int low, int mid, int high) {

        int i = low;
        int j = mid + 1;
        int k = low;
        int[] b = new int[arr.length]; // Temporary array to hold the merged values

        // Merge the two halves
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                b[k] = arr[i];
                i++;
            } else {
                b[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from the left half, if any
        while (i <= mid) {
            b[k] = arr[i];
            i++;
            k++;
        }

        // Copy remaining elements from the right half, if any
        while (j <= high) {
            b[k] = arr[j];
            j++;
            k++;
        }
        
        // Copy the merged array back to the original array
        for (int l = low; l <= high; l++) {
            arr[l] = b[l];
        }
    }
}
