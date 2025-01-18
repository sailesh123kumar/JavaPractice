package practice.java.program;

import java.util.Arrays;

public class OddNoInFrontEvenAtBack_ChatGpt {
	
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8};
		oddAtFrontEvenAtBack(a);
		
		System.out.println(Arrays.toString(a));
		
		
	}

	private static void oddAtFrontEvenAtBack(int[] a) {

		
		int temp[] =new int[a.length];
		int index = 0;
		
		for(int value: a) {
			if(value%2!=0) {
				temp[index++] = value;
			}
		}
		
		for(int value: a) {
			if(value%2==0) {
				temp[index++] = value;
			}
		}
		
		
		System.arraycopy(temp, 0, a, 0, a.length);
		
		
	
	}
}
