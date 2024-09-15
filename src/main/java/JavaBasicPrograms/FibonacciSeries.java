package JavaBasicPrograms;

import java.util.Scanner;

public class FibonacciSeries {
	
	
	
	public static void main(String[] args) {
		
		fibonacciseriesPrint();
		
		
	}
	
	
	public static void fibonacciseriesPrint() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the count of Fibonacci series to print : " );
		
		int noofIteratio = sc.nextInt();
		
		//Approach 1
//		int n1 = 0;
//		int n2 =1;
//		int sum = 0 ;
//		
//		System.out.print(n1+ " "+n2);
//		
//		for (int i = 2; i < noofIteratio; i++) {
//			
//			sum = n1 + n2 ;
//			System.out.print(" "+sum);
//			n1=n2;
//			n2=sum;
//			
//		}
		
		//Approach 2
		
//		int f = 0;
//		int s = 1;
//		int t = 0;
//		int count =1;
//		System.out.print(f +" " +s+ " ");
//		
//		while (count <noofIteratio) {
//			
//			t=f+s;
//			System.out.print(+t+ " ");
//			f=s;
//			s=t;
//			
//			
//			count++;
//			
//			
//		}
		
		
		//Approach 3
		
//		int f = -1;
//		int s = 1;
//		int t = 0;
//		int count =1;
//		
//		while (count <= noofIteratio) {
//			
//			t=f+s;
//			System.out.print(+t+ " ");
//			f=s;
//			s=t;
//			count++;
//		}
		
		//Approach 4
		
		int f = -1;
		int s = 1;
		int count =1;
		
		while (count <= noofIteratio) {
			
			System.out.print(f+s +" ");
			
			s=f+s;
			f=s-f;
			count++;
		}
		
		
		
	}

}
