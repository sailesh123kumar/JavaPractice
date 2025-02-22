package ArraysProgram;

import java.util.Arrays;

public class MoveAllZerosAtTheEndUsing2Pointer {

	
	public static void main(String[] args) {
		int a[]= {1,0,2,3,4,0,0,5,0,6,0,7};
		
		moveZerosatEndwithTempArray(a);
		
		System.out.println("=============================");
		
		moveZerosAtEnd(a);
		System.out.println(Arrays.toString(a));
		
	}

	private static void moveZerosatEndwithTempArray(int[] a) {

		int temp[] = new int [a.length];
		int index = 0;
		
		for(int e: a) {
			if(e>0) {
				temp[index++]= e;
			}
		}
		
		System.out.println(Arrays.toString(temp));
		
		System.arraycopy(temp, 0, a, 0, a.length);
		
	}

	private static void moveZerosAtEnd(int[] a) {

		int low = 0;
		int high = a.length-1;
		
		while(low<high) {
			
			while(low<high && a[low]!=0) {
				low++;
			}
			
			while(low<high && a[high]==0) {
				high--;
			}
			
			if(low<high) {
				int temp=a[low];
				a[low]=a[high];
				a[high]=temp;
				low++;
				high--;
			}
			
		}
	}
}
