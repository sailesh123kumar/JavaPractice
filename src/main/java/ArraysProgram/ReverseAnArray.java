package ArraysProgram;

public class ReverseAnArray {
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		
		reverseArray(arr);
	}

	private static void reverseArray(int[] arr) {

		int[] output = new int[arr.length];
		
		for (int i : arr) {
			System.out.print( i +" ");
		}
		
		
		System.out.println();
		System.out.println("Reversed Array");
		
		for (int i = arr.length-1,j=0; i >= 0; i--,j++) {
			
			output[j]=arr[i];
		}
		
		for (int j : output) {
			System.out.print(j +" ");
		}
		
	}

}
