package JavaBasicPrograms;

public class RemoveSpacesInAString {

	
	public static void main(String[] args) {
		String s = "Automation Testing with Selenium JAVA";
		System.out.println(removeSpaces(s));
		
		
	}

	private static String removeSpaces(String s) {

		char[] charArray = s.toCharArray();
		String output = "";
		
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i]!=' ') {
				output=output+charArray[i];
			}
		}
		return output;
	}
}
