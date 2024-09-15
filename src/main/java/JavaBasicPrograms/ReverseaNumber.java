package JavaBasicPrograms;

import java.util.Scanner;

public class ReverseaNumber {
	
	public static void main(String[] args) {
		
		reverseNum();
		
	}
	
	
	 public static void reverseNum() {
		  
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter the reversible Number : "  );
		  
		  int num = sc.nextInt();
		  
		  
		  // Approach 1
		  int rev=0;
		  
		  while (num!=0) {
			  
			 rev = rev*10 + num%10;
			 num = num / 10;
		}
		  
		  
		  
		  
		  System.out.println("Reversed number is : "+rev);
		  
	  }

}


 


