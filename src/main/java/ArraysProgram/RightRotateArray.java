package ArraysProgram;

import java.util.Arrays;

public class RightRotateArray {
	
	
	public static void main(String[] args) {
		
		
		int [] arr= {1,2,3,4,5,6,7};
		
		 System.out.println("Before Rotate ==>"+Arrays.toString(arr));
		
		int temp = arr[arr.length-1];
		
		
		for (int i = arr.length-1; i >=1; i--) {
			arr[i] = arr[i-1];
		}
		
	     arr[0] = temp;
		
	     
	     System.out.println("After Rotate ==>"+Arrays.toString(arr));
	}

}
