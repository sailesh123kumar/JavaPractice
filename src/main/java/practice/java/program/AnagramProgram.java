package practice.java.program;

public class AnagramProgram {
	
	
	public static void main(String[] args) {
		
		String input1 = "race";
		String input2 = "care";
		
		
		anagram(input1,input2);
	}

	private static void anagram(String input1, String input2) {

		boolean flag = false;
		int count = 0;
		if(input1.length() == input2.length()) {
			
			char[] charArray1 = input1.toLowerCase().toCharArray();
			char[] charArray2 = input2.toLowerCase().toCharArray();
			
			for (int i = 0; i < charArray2.length; i++) {
				char c = charArray1[i];
				for (int j = 0; j < charArray2.length; j++) {
					if(c==charArray2[j]) {
						charArray2[j]='\n';
						count++;
						break;
					}
				}
			}
			
			if (count==charArray1.length) {
				flag=true;
				System.out.println("Given Strings are Anagram");
			}
			else {
				System.out.println("Not a anagram");
			}
		}
		else {
			System.out.println("Not a anagram");
		}
		
	}

}
