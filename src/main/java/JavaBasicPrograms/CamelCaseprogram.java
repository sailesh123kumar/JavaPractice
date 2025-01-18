package JavaBasicPrograms;

public class CamelCaseprogram {
	
	private static String camelcasewithoutstringbuffer(String input) {
		
		String output="";
		boolean capitalizeNext=false;
		
		char[] charArray = input.toCharArray();
		
		for(char c:charArray) {
			if(c==' ') {
				capitalizeNext=true;
			}
			else if(capitalizeNext) {
				output += Character.toUpperCase(c);
				capitalizeNext=false;
			}
			else {
				output +=Character.toLowerCase(c);
			}
		}
		return output;
	}
	
	
	public static void main(String[] args) {
		
		String input = "i love automation testing";
		
		String output = camelcasewithoutstringbuffer(input);
		System.out.println(output);
		
	}

	

}
