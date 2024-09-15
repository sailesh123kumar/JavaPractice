package JavaBasicPrograms;

public class FindPrimeNumber {
	
	
	public static void main(String[] args) {
		
		int no = 29;
		int count = 0;
		
		for (int i=2 ; i<no ; i++) {
			
			if(no % i ==0) {
				
				count++;
			}
			
		}
		
		if(count == 0) {
			System.out.println(no +" Is a prime");
		}
		else {
			System.out.println(no +" Is not a prime");
		}
		
	}

}
