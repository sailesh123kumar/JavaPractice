package ArraysProgram;

public class LargestElementInArray {

	
public static void main(String[] args) {
		
		int [] arr = {10,78,40,88,10,70,60,40,90,40,80,108};
		int largest = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		
		System.out.println(largest);
		
}
}
