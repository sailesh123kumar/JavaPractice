package JavaBasicPrograms;

import java.util.Scanner;

public class ReverseaWords {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the words to perform Reverse operation");
		String originalString = sc.nextLine();
		
		String reversedWithSameIndex="";
		
		for (String s : originalString.split(" ")) {
			reversedWithSameIndex=reversedWithSameIndex + ReverseaString.reverseaString(s)+" ";
		}
		
		System.out.println(originalString);
		System.out.println(reversedWithSameIndex.trim());
		
	}

}
