package JavaBasicPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class SortTheUniqueelementatBegining {
	
	public static void sortTheUniqueArray_optimal(){
		
	int[] arr= {1,1,2,2,2,3,3,4};
		
		
		int i=0;
		for(int j=1 ; j<arr.length; j++)
		{
			if(arr[j]!=arr[i]) {
				arr[i+1]=arr[j];
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void sorttheUniquearray_BruteApproachusingSet() {
		int[] arr= {1,1,2,2,2,3,3,4};
		Set<Integer> s=new HashSet<Integer>();
		
		for (int i : arr) {
			s.add(i);
		}
		
		System.out.println(s);
		
	}
	
	public static void main(String[] args) {
		//sortTheUniqueArray_optimal();
		sorttheUniquearray_BruteApproachusingSet();
	}

}
