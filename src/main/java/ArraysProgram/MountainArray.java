package ArraysProgram;

public class MountainArray {
	
	
	public static void main(String[] args)
	{
		
		int a[]= {29,33,47,88,108,99,45,23,12,11};
		
		boolean mountainArray = mountainArray(a);
		System.out.println(mountainArray);
		
	}

	private static boolean mountainArray(int[] a) {

		if(a.length<3) {
			return false;
		}
		
		int i=0;
		while(i+1 < a.length && a[i+1] > a[i] ) {
			i++;
		}
		
		while(i+1 < a.length && a[i+1] < a[i] ) {
			i++;
		}
		
		return i == a.length-1;
		
	}

}
