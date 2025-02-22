package JavaBasicPrograms;

import java.util.Iterator;

public class ReplaceMethods {
	
	
	public static void main(String[] args) {
		
		String s1 = "Automation123 Selenium Java";
		
		
		String replace = s1.replaceAll("\\d", "");
		System.out.println("Remove Numbers : "+replace);
		
		String replaceAll = s1.replaceAll("[A-Za-z]", "");
		System.out.println("Remove alphabets : "+replaceAll);
		
		String replaceAll2 = s1.replaceAll("[^A-Z ]", "");
		System.out.println("Upper case Only with space : "+replaceAll2);
		
		String replaceAll3 = s1.replaceAll("[^A-Z]", "");
		System.out.println("Upper case Only without space : "+replaceAll3);
		
		String replaceAll4 = s1.replaceAll("[^a-z ]", "");
		System.out.println("lower case Only with space : "+replaceAll4);
		
		String replaceAll5 = s1.replaceAll("[^a-z]", "");
		System.out.println("lower case Only without space : "+replaceAll5);
		
		Integer int1 = Integer.parseInt(replaceAll.trim());
		System.out.println(int1);

		int sum =0;
	
		while(int1!=0) {
			int rem =int1%10;
			sum+=rem;
			int1= int1/10;
		}
		
		System.out.println(sum);

	}

}
