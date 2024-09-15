package JavaBasicPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramUsingArray {

	public static boolean anagramString(String s1 , String s2) {
		char[] c1 = s1.toLowerCase().toCharArray();
		char[] c2 = s2.toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean flag = Arrays.equals(c1, c2);
		return flag;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str1 = sc.nextLine();
		System.out.println("Enter the second string: ");
		String str2 = sc.nextLine();
		
		if(anagramString(str1,str2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
		
	}
}
