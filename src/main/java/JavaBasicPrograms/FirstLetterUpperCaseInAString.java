package JavaBasicPrograms;

public class FirstLetterUpperCaseInAString {

	public static String firstleterUpperCaseinWordwithspace(String input) {

		String[] words = input.split(" ");
		String result = "";

		for (String s : words) {

			result += Character.toUpperCase(s.charAt(0));
			result += s.substring(1)+" ";

		}

		return result.trim();

	}
	
	public static String firstleterUpperCaseinWordwithoutSpace(String input) {

		String[] words = input.split(" ");
		String result = "";

		for (String s : words) {

			result += Character.toUpperCase(s.charAt(0));
			result += s.substring(1);

		}

		return result.trim();

	}

	public static void main(String[] args) {

		String input = "i love automation testing";

		String output = firstleterUpperCaseinWordwithspace(input);
		String output1 = firstleterUpperCaseinWordwithoutSpace(input);
		System.out.println(output);
		System.out.println(output1);
		
	}

}
