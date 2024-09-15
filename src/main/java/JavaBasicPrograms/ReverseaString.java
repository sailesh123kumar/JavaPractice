package JavaBasicPrograms;

import java.util.Scanner;

public class ReverseaString {
	
	public static String reverseaString(String s) {
		
//		if(s.length()==0) {
//			return s;
//		}
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev= rev+ s.charAt(i);
		}
		
		return rev ;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to perform Reverse operation");
		String originalString = sc.nextLine();
		
		String reversedString = reverseaString(originalString);
		System.out.println("Given String is ==>" +originalString);
		System.out.println("Reversed String is ==>"+reversedString); 
		
	}

}
