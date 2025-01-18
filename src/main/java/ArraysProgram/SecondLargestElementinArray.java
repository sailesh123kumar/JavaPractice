package ArraysProgram;

public class SecondLargestElementinArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 9, 11, 21, 25 , 25  ,25};

		int largest = Integer.MIN_VALUE;

		int secondlargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				secondlargest = largest;
				largest = arr[i];
			}

			else if (arr[i] > secondlargest && arr[i] != largest) {
				secondlargest = arr[i];
			}

		}

		System.out.println(largest);
		System.out.println(secondlargest);
	}
}
