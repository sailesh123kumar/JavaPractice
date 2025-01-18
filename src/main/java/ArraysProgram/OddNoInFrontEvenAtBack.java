package ArraysProgram;

import java.util.Arrays;

public class OddNoInFrontEvenAtBack {
	
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8};
		oddAtFrontEvenAtBack(a);
		
		System.out.println(Arrays.toString(a));
		
		
	}

	private static void oddAtFrontEvenAtBack(int[] a) {

		int low = 0;
		int high = a.length-1;
		
		while(low<high) {
			
			while(low<high && a[low]%2!=0) {
				low++;
			}
			
			while(low<high && a[high]%2==0) {
				high--;
			}
			
			if(low<high) {
				int temp = a[low];
				a[low]=a[high];
				a[high]=temp;
				low++;
				high--;
			}
		}
	}
}
