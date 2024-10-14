package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;



public class Hook1 //extends CommonCunstructor
{
	
	public  WebDriver driver;
	
	public Hook1(WebDriver driver)
	{
		this.driver=driver;
	}
		@Before
	public void launch()
	{
		driver=new ChromeDriver();
		WebDriverManagerClass.setDriver(driver);
	}
	
	
	/*
	 * public WebDriver getDriver() { return driver; }
	 */
	 
}
