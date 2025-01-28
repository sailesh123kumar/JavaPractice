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
		
		String input = "abcdefghijabcdefghijk";
		
		int longestSubString = longestSubString(input);
		
		System.out.println(longestSubString);
	}

	
	
}
