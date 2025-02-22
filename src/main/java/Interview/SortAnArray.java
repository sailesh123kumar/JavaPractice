package Interview;

import java.util.Arrays;

public class SortAnArray {

	
	public static void main(String[] args) {
		
		int a[] = {34,55,88,10,12};
		
		for(int i=0 ; i<a.length-2;i++) {
			for(int j=i+1; j<a.length;j++) {
				
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
}
