package ArraysProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindFirstTwoNumberPairToAchieveTarget {
	
	
	private static int[] findTwoNum(int[] arr, int target) {

		Map<Integer,Integer> keyIndex = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
			 int extra = target - arr[i]; 
			
			if (keyIndex.containsKey(extra)) {
				return new int[] {keyIndex.get(extra) ,i};
			}
			else {
				keyIndex.put(arr[i], i);
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		
		int target = 7;
		int arr[]= {2,4,1,9,7,5};
		int[] twoNum = findTwoNum(arr,target);
		
		System.out.println(Arrays.toString(twoNum));
		

	}

	

}
