package ArraysProgram;

import java.util.Arrays;

public class DuplicatelementFrequencyinArray {
	
	
	public static void main(String[] args) {
		
		int [] arr = {10,20,40,20,10,30,60,40,60,40,80};
		int [] freq = new int[arr.length];
		int visited = -1;
		
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					count++;
					freq[j]=visited;
				}
			}
			if(freq[i]!=visited) {
				freq[i]=count;
			}
		}
		
		
		System.out.println("All Elements and their counts");
		for (int i = 0; i < freq.length; i++) {
			if(freq[i]!=visited) {
				System.out.println("Element : "+ arr[i] +" Occurrence : "+ freq[i]);
			}
		}
		System.out.println("==================================");
		System.out.println("Duplicate Elements and their counts");
		for (int i = 0; i < freq.length; i++) {
			if(freq[i]!=visited && freq[i]>1) {
				System.out.println("Element : "+ arr[i] +" Occurrence : "+ freq[i]);
			}
		}
		
		
		System.out.println("==================================");
		System.out.println("Unique Elements and their counts");
		for (int i = 0; i < freq.length; i++) {
			if(freq[i]!=visited && freq[i]==1) {
				System.out.println("Element : "+ arr[i] +" Occurrence : "+ freq[i]);
			}
		}
		
		System.out.println("==================================");
		System.out.println("Maximum occurence Elements and their counts");
		int temp = 0;
		int largest = freq[0];
		for (int i = 1; i < freq.length; i++) {
				if(freq[i]>largest) {
					largest=freq[i];
					System.out.println("Element : "+ arr[i] +" Occurrence : "+ freq[i]);
				}
			}
			
			
		}
		
		
	}


