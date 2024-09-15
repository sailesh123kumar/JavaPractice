package SeleniumInterfaceArchitecture;

public class BrowserTest {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		String browserName = "chrome";

		switch (browserName.toLowerCase().trim()) {

		case "chrome":
			//We should avoid using this because of creating the multiple objects
			//ChromeDriver driver = new ChromeDriver();  
			//Top Casting - Creating object to Parent class by pointing child class
			driver = new ChromeDriver();  
			break;

		case "firefox":
			//FireFoxDriver driver1 = new FireFoxDriver();
			driver = new FireFoxDriver();  //Top Casting
			break;

		case "edge":
			//EdgeDriver driver2 = new EdgeDriver();
			driver = new EdgeDriver();  //Top Casting
			break;

		default:
			break;
		}
		
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		
		if(title.equals("Amazon")) {
			System.out.println("title is correct");
		}
		else {
			System.out.println("title is not correct");
		}
		
		driver.findelement("amazon logo");
		
		driver.sendKeys("email", "sailesh@gmail.com");
		driver.sendKeys("password", "sailesh@123");
		driver.click("loginbtn");
		
		driver.close();

	}

}
