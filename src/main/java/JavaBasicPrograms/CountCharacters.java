package JavaBasicPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class CountCharacters {

	public static Map<Character, Integer> charCount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {

			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}

		}
		return map;
	}

	public static void main(String[] args) {

		try {
			Map<Character, Integer> charCount = charCount();

			Iterator<Entry<Character, Integer>> it = charCount.entrySet().iterator();
			System.out.println("===DUPLICATE ELEMENTS===");
			while (it.hasNext()) {

				Entry<Character, Integer> next = it.next();

				if (next.getValue() > 1) {
					System.out.println("key :" + next.getKey() + " = " + "value :" + next.getValue());
				}

			}
			
			Iterator<Entry<Character, Integer>> it1 = charCount.entrySet().iterator();
			System.out.println("===UNIQUE ELEMENTS===");
			while (it1.hasNext()) {
				Entry<Character, Integer> next = it1.next();
				
				if (next.getValue() == 1) {
					System.out.println("key :" + next.getKey() + " = " + "value :" + next.getValue());
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
