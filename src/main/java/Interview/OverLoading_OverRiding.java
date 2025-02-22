package Interview;

public class OverLoading_OverRiding {
	
	
	public void click() {
		System.out.println("Clicked the webelement");
	}
	
	public void click(long a) throws InterruptedException {
		Thread.sleep(a);
		System.out.println("Clicked the webelement with wait");
	}
	
	public void Default_browser() {
		System.out.println("Launch Chrome browser");
	}

	
	public static void main(String[] args) throws InterruptedException {
		
		OverLoading_OverRiding ol = new OverLoading_OverRiding();
		
		ol.click();
		ol.click(3000);
		
		
	}
}
