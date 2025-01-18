package JavaBasicPrograms;

public class ReverseAlternateWords {

	
	public static void main(String[] args) {
		
		String input=  "Selenium Cypress Playwright WebDriverIO";
		
		String reverseAlternateWords = reverseAlternateWords(input);
		
		System.out.println(reverseAlternateWords);
		
	}

	private static String reverseAlternateWords(String input) {

		String[] words = input.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		
		for (int i = 0; i < words.length; i++) {
			
			if(i%2==0 || i==0) {
				sb.append(words[i]);
			}
			else {
				char[] charArray = words[i].toCharArray();
				
				for (int j = charArray.length-1 ; j >=0 ; j--) {
					
					sb.append(charArray[j]);
					
				}
			}
			sb.append(" ");
		}
		
		return sb.toString().trim();
	}
	
}
