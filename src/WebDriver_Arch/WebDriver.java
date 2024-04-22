package WebDriver_Arch;

public interface WebDriver extends SearchContext {

	public void get(String url);

	public String getTitle();

	public String getURL();

	public void click(String eleName);

	public void sendKeys(String eleName, String value);

	public void close();

	@Override
	public void finElement(String eleName);

	@Override
	public void findElements();
	
	//we are using interface beacuse we don t no the logic 
	//just giving the template
	//if we know the some logic then we are using abstract classes

}
