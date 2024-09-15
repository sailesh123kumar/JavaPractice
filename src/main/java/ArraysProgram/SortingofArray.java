package ArraysProgram;

import java.util.Arrays;

public class SortingofArray {
	
	public static void main(String[] args) {
		
		int [] arr = {90,100,120,40,50,20};
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int e: arr) {
			System.out.print(e + " ");
		}
		
		
	}

}
