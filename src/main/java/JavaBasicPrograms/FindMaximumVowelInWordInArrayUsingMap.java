package JavaBasicPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindMaximumVowelInWordInArrayUsingMap {
	
	public static void main(String[] args) {
		
		String [] arr = {"Orange" , "Red" ,"Blue" ,"White" ,"Yellow" ,"Magentagreen"};
		
		Map<String, Integer> maxVowelsInaString = maxVowelsInaString(arr);
		Map<String, Integer> sortedMap = sortMapByValue(maxVowelsInaString);
		
		
		//To Fetch The LastKey and LastValue from the sortedMap
		 if (!sortedMap.isEmpty()) {
	            Entry<String, Integer> lastEntry = null;
	            for (Entry<String, Integer> entry : sortedMap.entrySet()) {
	                lastEntry = entry; // Keep updating the last entry
	            }
	            
	            if (lastEntry != null) {
	                System.out.println("Maximum vowel word: " + lastEntry.getKey()+ " || Count of Vowel: " + lastEntry.getValue());
	            }
	        }
		
		
	}

	private static Map<String, Integer> maxVowelsInaString(String[] arr) {

		Map<String,Integer> map = new HashMap<String,Integer>();
		
		//To Loop the array with index based String
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i].toLowerCase();
			int count = 0;
			
		//To identify the vowels count in each word	
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u') {
					count++;
				}
			}
			map.put(arr[i], count);
		}
		System.out.println("Unsorted Map ===>"+map);
		return map;
	}

	
	
	private static Map<String, Integer> sortMapByValue(Map<String, Integer> map){

		List<Entry<String, Integer>> arrList = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

		// To sort the Map based on the value
		Collections.sort(arrList, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		// To add the sorted key value in the sortedMap
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		for (Entry<String, Integer> entry : arrList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		System.out.println("Sorted Map ===>" + sortedMap);
		
		return sortedMap;

	}
}
