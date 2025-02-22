package Interview;

public class Upcasting extends ParentClass {
	
	public void method1() {
		System.out.println("Child class method");
	}
	
	public static void main(String[] args) {
		
		ParentClass pc = new Upcasting();
		pc.method1();
		
		Upcasting up = (Upcasting) pc;
		pc.method1();
		
	}


}
