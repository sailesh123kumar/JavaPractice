package JavaBasicPrograms;

public class CountDigitFromString {
	
	
	public static void main(String[] args) {
		
		String input = "Autoation123";
		
		char[] charArray = input.toCharArray();
		
		int digitCount=0;
		
		for (int i = 0; i < charArray.length; i++) {
			
			if (Character.isDigit(charArray[i])) {
				digitCount++;
			}
		}
		System.out.println(digitCount);
	}

}
