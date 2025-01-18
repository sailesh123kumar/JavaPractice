package ArraysProgram;

public class MaxAndMinElementInArray {
	
	
	public static void main(String[] args) {
		
		int [] array= {99,120,1,118,124,25};
		
		int max=array[0];
		int min=array[0];
		
		for(int e : array) {
			
			if (e>max) {
				max=e;
			}
			if (e<min) {
				min=e;
			}
		}
		
		System.out.println("Maximum element in Array ==>"+max);
		System.out.println("Minimum element in Array ==>"+min);
		
		
	}

}
