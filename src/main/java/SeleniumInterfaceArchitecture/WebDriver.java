package SeleniumInterfaceArchitecture;

public interface WebDriver extends SearchContext {
	
	
	
	@Override
	public void findelement(String name);
	
	@Override
	public void findelements(String name);
	
	public void get(String url);
	
	public String getTitle();
	
	public void click(String element);
	
	public void sendKeys(String element , String value);
	
	public void close();
	
	
	
	
	
	

}
