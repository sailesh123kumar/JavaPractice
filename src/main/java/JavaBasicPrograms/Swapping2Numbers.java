package JavaBasicPrograms;

import java.util.Scanner;

public class Swapping2Numbers {
	
	public static void main(String[] args) {
		
		//Approach 1
		
		 enterSwappingNum();
		
	}
	
	public static void enterSwappingNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number to Swap: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number to Swap: ");
		int num2 = sc.nextInt();
		
		System.out.println("Before swapping first number :" +num1+" second number :" +num2);
		
		//Approach 1
//		num1 = num1 + num2;
//		num2 = num1 - num2;
//		num1 = num1 - num2;
		
		//Approach 2
//		int temp=0;
//		
//		temp=num1;
//		num1=num2;
//		num2=temp;
		
		
		//Approach 3
		//Use of * and /
		//when any one the number is 0 it wont worn on this scenario
		
		num1 = num1* num2;
		num2 = num1/num2 ;
		num1 = num1/num2 ;
		
		System.out.println("After swapping first number :" +num1+" second number :" +num2);

				
		
	}

}
