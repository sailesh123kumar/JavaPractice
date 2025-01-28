package JavaBasicPrograms;

import java.util.Arrays;

public class AllPossibleSubStringSavingInArray {

	public static void main(String[] args) {

		String s = "sailesh";
		
		int len = s.length();
		
		int pos_Size = len * (len+1)/2 ;
		
		String a[] = new String [pos_Size];
		
		int index=0;
		
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				String substring = s.substring(i, j);
				a[index++] = substring;
			}
			
		}
		
		System.out.println(Arrays.toString(a));
		
	}

}
