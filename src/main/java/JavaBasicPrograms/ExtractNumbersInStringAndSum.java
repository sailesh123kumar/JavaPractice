package JavaBasicPrograms;

public class ExtractNumbersInStringAndSum {

	public static void main(String[] args) {
		
		String s1 = "Automation123 Selenium Java";
				
		String replaceAll = s1.replaceAll("[A-Za-z]", "");
		System.out.println("Remove alphabets : "+replaceAll);
		
		Integer int1 = Integer.parseInt(replaceAll.trim());
		System.out.println(int1);

		int sum =0;
	
		while(int1!=0) {
			int rem =int1%10;
			sum+=rem;
			int1= int1/10;
		}
		
		System.out.println(sum);
	}
}
