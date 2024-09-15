package ArraysProgram;

import java.util.Arrays;

public class LeftRoteArrayDtimes {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Original Array : " + Arrays.toString(arr));

		int d = 3;
		int n = arr.length;
		int[] temp = new int[d];

		//Temporary array stored with d indexes
		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}
		System.out.println("Temporary Aray : " + Arrays.toString(temp));

		//Indexes pulled i-d times and i starts at d
		for (int i = d ; i < arr.length; i++) {
			arr[i - d] = arr[i];
		}
		System.out.println("Temp Removed Array : " + Arrays.toString(arr));
		
		for (int i = n-d; i < arr.length; i++) {
			arr[i]=temp[i-(n-d)];
		}
		System.out.println("D times rotated Array and Temp pushed : " + Arrays.toString(arr));

	}

}
