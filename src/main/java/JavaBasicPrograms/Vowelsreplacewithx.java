package JavaBasicPrograms;

public class Vowelsreplacewithx {

	
	public static void main(String[] args) {
		
		String input= "name";
		input.toLowerCase();
		String output ="";
		System.out.println("String length ===>"+input.length());
		
		for(int i=0;i<input.length();i++) {
			char c = input.charAt(i);
			if(c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ) {
				output = output+'x';
			}
			else {
				output = output+c;
			}
		}
		System.out.println(output);
	}
}
