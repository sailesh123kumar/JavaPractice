package ArraysProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonlementInTwoArray {
	
	
	public static void main(String[] args) {
		
		int [] arr1 = {1,2,3,4,5,6};
		int [] arr2 = {7,8,9,2,4,6};
		
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> common = new HashSet<Integer>();
		
		
		for(Integer e:arr1) {
			set1.add(e);
		}
		
		for(Integer e:arr2) {
			if (set1.contains(e)) {
				common.add(e);
			}
			
		}
		
		
		System.out.println(common);
		
	}

}
