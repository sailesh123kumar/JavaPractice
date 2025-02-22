package ArraysProgram;

import java.util.Arrays;

public class MoveAllZerosAttheEnd {
	
	
	public static void main(String[] args) {
		
		int [] a = {1,0,2,4,0,8,0,9,5,12,0,4};
		moveAllzerosToEnd(a);
		
		
		
	}

	private static void moveAllzerosToEnd(int[] a) {
		
		
		int temp[] = new int[a.length];
		int index = 0;
		
		for(int num: a) {
			if(num!=0 && index<a.length) {
				temp[index++]=num;
			}
		}
		
		while(index<a.length) {
			temp[index++]=-0;
		}
		System.out.println(Arrays.toString(temp));
	}

}
