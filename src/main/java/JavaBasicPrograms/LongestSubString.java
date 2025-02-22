package JavaBasicPrograms;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {
	
	private static int longestSubString(String input) {

		int start = 0;
		int max = 0;
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for (int end = 0; end < input.length(); end++) {
			char c = input.charAt(end);
			if (map.containsKey(c)) {
				start = Math.max(start, map.get(c)+1);
			}
				map.put(c, end);
				max = Math.max(max, end-start+1);
			
		}
		return max;
		
	}

	public static void main(String[] args) {
		
		//String input1 = "abcdefghijabcdefghijk";
		String input2 = "abcab";
		String input3 = "abcaabbccabcd";
		String input4 = "sbcde";
		
	//	int longestSubString1 = longestSubString(input1);
		int longestSubString2 = longestSubString(input2);
		int longestSubString3 = longestSubString(input3);
		int longestSubString4 = longestSubString(input4);
		
	//	System.out.println(longestSubString1);
		System.out.println(input2 +"-> "+longestSubString2);
		System.out.println(input3 +"-> "+longestSubString3);
		System.out.println(input4 +"-> "+longestSubString4);
	}

	
	
}
