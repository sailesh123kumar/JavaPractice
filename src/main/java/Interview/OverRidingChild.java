package Interview;

public class OverRidingChild extends OverLoading_OverRiding {
	
	
	public void Default_browser() {
		System.out.println("Launch Edge browser");
	}

	
	public static void main(String[] args) {
		OverRidingChild or = new OverRidingChild();
		or.Default_browser();
	}
}
