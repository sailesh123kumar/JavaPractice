package ArraysProgram;

public class ThirdLargestinArray {
	
	
	public static void elementinArray() {
		
		int[] arr = { 9, 7, 6, 3,  14, 2 };

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			}
			else if(arr[i]>second && arr[i] != first) {
				third = second;
				second = arr[i];
			}
			else if (arr[i]>third && arr[i] != first && arr[i] != second) {
				third=arr[i];
			}
				
		}
		System.out.println("first===>"+first);
		System.out.println("second===>"+second);
		System.out.println("third===>"+third);
		
		
	}

	public static void main(String[] args) {
		
		elementinArray();

//		int[] arr = { 9, 7, 6, 3, 11, 14, 2 };
//
//		int first = arr[0];
//		int second = Integer.MIN_VALUE;
//		int third = Integer.MIN_VALUE;
//
//		for (int i = 0; i < arr.length; i++) {
//
//			if (arr[i] > first) {
//				third = second;
//				second = first;
//				first = arr[i];
//			}
//			else if(arr[i]>second) {
//				third = second;
//				second = arr[i];
//			}
//			else if (arr[i]>third) {
//				third=arr[i];
//			}
//				
//		}
//		System.out.println("first===>"+first);
//		System.out.println("second===>"+second);
//		System.out.println("third===>"+third);
		
		

	}

}
