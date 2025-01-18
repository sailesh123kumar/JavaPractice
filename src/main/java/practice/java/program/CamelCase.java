package practice.java.program;

public class CamelCase {
	
	public static void main(String[] args) {
		
		String input ="test automation using selenium java with rest api";
		String output="";
		
		StringBuilder sb = new StringBuilder();
		
		char[] charArray = input.toCharArray();
		
		boolean next = false;
		
		for (int i = 0; i < charArray.length; i++) {

			if(charArray[i]==' ') {
				next=true;
			}
			else if(next) {
				sb.append(Character.toUpperCase(charArray[i]));
				next=false;
			}
			else {
				sb.append(Character.toLowerCase(charArray[i]));

			}
			
		}
			System.out.println(sb);
	}

}
