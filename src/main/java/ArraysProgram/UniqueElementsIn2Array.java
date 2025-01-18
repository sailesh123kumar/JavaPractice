package ArraysProgram;

import java.util.HashSet;
import java.util.Set;

public class UniqueElementsIn2Array {
	
	public static void main(String[] args) {
		
		int [] arr1 = {1,2,3,4,5,6};
		int [] arr2 = {7,8,9,2,4,6};
		
		Set<Integer> unique = new HashSet<Integer>();
		
		for(Integer e : arr1) {
			unique.add(e);
		}
		
		for(Integer e : arr2) {
			unique.add(e);
		}
		
		System.out.println(unique);
	}

}
