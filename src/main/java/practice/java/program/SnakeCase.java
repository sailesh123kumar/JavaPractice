package practice.java.program;

public class SnakeCase {
	
	public static void main(String[] args) {
		
		String input ="test automation using selenium java with rest api";
		char[] charArray = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		boolean next = false;
		
		for (int i = 0; i < charArray.length; i++) {
			if (i==0) {
				sb.append(Character.toUpperCase(charArray[i]));
			}
			else if (charArray[i]==' ') {
				next=true;
			}
			else if (next) {
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
