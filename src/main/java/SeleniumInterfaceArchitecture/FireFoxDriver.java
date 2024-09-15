package SeleniumInterfaceArchitecture;

public class FireFoxDriver implements WebDriver {
	
	
	public FireFoxDriver() {
		System.out.println("FireFox Browser is launched");
	}

	@Override
	public void findelement(String name) {
		System.out.println("finding element with name :" +name);
	}

	@Override
	public void findelements(String name) {
		System.out.println("finding elements with name :" +name);

	}

	@Override
	public void get(String url) {
		System.out.println("launch url :" +url);
	}

	@Override
	public String getTitle() {
		return "Amazon";
	}

	@Override
	public void click(String element) {
		System.out.println("Clicking on the element :"+element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("enter the value : " +value+ " in element :" +element);
	}

	@Override
	public void close() {
		System.out.println("close the browser");
	}

}
