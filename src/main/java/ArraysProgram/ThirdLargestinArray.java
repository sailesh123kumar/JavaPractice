package ArraysProgram;

public class ThirdLargestinArray {

	public static void main(String[] args) {

		int[] arr = { 9, 7, 6, 3, 11, 14, 2 };

		int first = arr[0];
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			}
			else if(arr[i]>second) {
				third = second;
				second = arr[i];
			}
			else if (arr[i]>third) {
				third=arr[i];
			}
				
		}
		System.out.println("first===>"+first);
		System.out.println("seconf===>"+second);
		System.out.println("third===>"+third);
		
		

	}

}
