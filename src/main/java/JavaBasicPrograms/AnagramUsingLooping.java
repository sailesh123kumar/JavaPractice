package JavaBasicPrograms;

public class AnagramUsingLooping {
	

	public static void main(String[] args) {
		

		String s1 = "rare";
		String s2 = "race";
		char[] c1 = s1.toLowerCase().toCharArray();
		char[] c2 = s2.toLowerCase().toCharArray();
		int count=0;
		boolean flag = false;
		
		if(s1.length()==s2.length()) {
			
			for (int i = 0; i < c2.length; i++) {
				char c =c2[i];
				for (int j = 0; j < c2.length; j++) {
					if(c1[j]==c) {
						c1[j]='\n';
						count++;
						break;
					}
				}
				if(s1.length()== count) {
					flag=true;
					System.out.println("Anagram");
					break;
				}
			}
		}
		
		if(flag == false) {
			System.out.println("Not Anagram");
		}
		
	}

}
