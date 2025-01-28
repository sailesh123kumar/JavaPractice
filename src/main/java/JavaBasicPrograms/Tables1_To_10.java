package JavaBasicPrograms;

public class Tables1_To_10 {
	
	
	public static void main(String[] args) {
		
		int table = 10;
		int times = 10;
		for (int i = 1; i <= table; i++) {
			for (int j = 1; j <= times; j++) {
				System.out.println(i  +" x "+  j +" = " + i*j);
			}
			System.out.println("=============================");
		}
	}
}
