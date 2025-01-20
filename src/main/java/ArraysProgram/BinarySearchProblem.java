package ArraysProgram;

public class BinarySearchProblem {
	
	public static int binarySearch(int [] arr, int target) {
	
		int left = 0;
		int right = arr.length-1;
		
		
		while(left <= right)
		{
			int mid = left + (right-left)/2;
			if(arr[mid]==target)
			{
			return mid;
			}
			
			else if(arr[mid]<target) 
			{
			left = mid + 1;
			}
			else 
			{
			right = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int [] arr = {2,3,8,9,10,12,24,36,48,49,84,89};
		
		int index = binarySearch(arr, 3);
		
		if(index!=-1) {
			System.out.println("elemaent is available on the index ==> "+index);
		}
		else {
			System.out.println("===Element not found===");
		}
	}

}
