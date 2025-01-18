package JavaBasicPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class OccurenceoOfCharacters {
	
	
	
	public static void main(String[] args) {
		String s = "automation testing";
		
		
		occurenceOfCharcters(s);
		
		
	}

	private static void occurenceOfCharcters(String s) {

		Map<Character, Integer> characterMap = new LinkedHashMap<Character, Integer>();
		char[] charArray = s.toCharArray();
		
		for(char c : charArray) {
			if (characterMap.containsKey(c)) {
				characterMap.put(c, characterMap.get(c)+1);
			}
			else {
				characterMap.put(c, 1);
			}
		}
		
		System.out.println(characterMap);
		
		
		System.out.println("To Print the Duplicate Character");
		Set<Entry<Character, Integer>> entrySet = characterMap.entrySet();
		
		for (Entry<Character, Integer> entry : entrySet) {
			Character key = entry.getKey();
			Integer value = entry.getValue();
			if(value>1) {
				System.out.println(key + " ==>" + value);
			}
			
		}
		
		System.out.println();
		System.out.println("To Print the Unique Character");
		for (Entry<Character, Integer> entry : entrySet) {
			Character key = entry.getKey();
			Integer value = entry.getValue();
			if(value==1) {
				System.out.println(key + " ==>" + value);
			}
			
		}
		
		
	}

}
