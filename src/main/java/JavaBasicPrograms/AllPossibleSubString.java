package JavaBasicPrograms;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleSubString {
	
	public static void main(String[] args) {
		String s = "cat";
		
		
		List<String> result = subString(s);
		System.out.println(result);
	}
	
	

	private static List<String> subString(String s) {
		List<String> subStringList = new ArrayList<String>();
		
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				String subString = s.substring(i, j);
				subStringList.add(subString);
			}
		}
		return subStringList;
	}

}
